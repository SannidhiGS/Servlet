document.addEventListener('DOMContentLoaded', () => {

    const emailEl = document.getElementById('email');
    const genderEls = document.getElementsByName('gender');
    const dobEl = document.getElementById('dob');
    const mtEl = document.getElementById('motherTongue');
    const religionEl = document.getElementById('religion');
    const msEl = document.getElementById('status');
    const heightEl = document.getElementById('height');
    const forTypeEl = document.getElementById('forType');
    const submitBtn = document.getElementById('submitBtn');
    const forLabel = document.getElementById('forLabel');
    const form = document.getElementById('matrimonyForm');

    function getSelectedGender() {
        for (const g of genderEls)
            if (g.checked) return g.value;
        return null;
    }

    function updateForLabel() {
        const gender = getSelectedGender();

        if (gender === 'Male') {
            forLabel.innerText = "Groom's (For) *";
        } else if (gender === 'Female') {
            forLabel.innerText = "Bride's (For) *";
        } else {
            forLabel.innerText = "For *";
        }
    }

    function validateForm() {
        const email = emailEl.value.trim();
        const gender = getSelectedGender();
        const dob = dobEl.value;
        const mt = mtEl.value;
        const religion = religionEl.value;
        const ms = msEl.value;
        const height = heightEl.value;
        const forType = forTypeEl.value;

        const emailValid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
        const heightNum = Number(height);
        const heightValid = height !== "" && !isNaN(heightNum) && heightNum >= 1 && heightNum <= 7;
        const forTypeValid = forType !== "";

        const allValid =
            emailValid &&
            gender &&
            dob &&
            mt &&
            religion &&
            ms &&
            heightValid &&
            forTypeValid;

        submitBtn.disabled = !allValid;
        return allValid;
    }

    // Event listeners
    emailEl.addEventListener('input', validateForm);
    dobEl.addEventListener('change', validateForm);
    mtEl.addEventListener('change', validateForm);
    religionEl.addEventListener('change', validateForm);
    msEl.addEventListener('change', validateForm);
    heightEl.addEventListener('input', validateForm);
    forTypeEl.addEventListener('change', validateForm);

    genderEls.forEach(g =>
        g.addEventListener('change', () => {
            updateForLabel();
            validateForm();
        })
    );

    // Initial load
    updateForLabel();
    validateForm();

    // Prevent submit if invalid
    form.addEventListener('submit', e => {
        if (!validateForm()) e.preventDefault();
    });

});
