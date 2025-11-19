<!DOCTYPE html>
<html>
<head>
    <title>Survey Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container my-5">
    <h1 class="text-center mb-4">Citizen Survey Form</h1>

    <form action="survey" method="post" class="p-3 bg-white shadow rounded">


        <fieldset class="mb-3">
            <legend>Personal Information</legend>
            <input type="text" name="name" placeholder="Name" class="form-control mb-2">
            <input type="text" name="fatherName" placeholder="Father Name" class="form-control mb-2">
            <input type="text" name="motherName" placeholder="Mother Name" class="form-control mb-2">
            <input type="text" name="married" placeholder="Married" class="form-control mb-2">
            <input type="text" name="spouseName" placeholder="Wife/Husband Name" class="form-control mb-2">
            <input type="number" name="age" placeholder="Age" class="form-control mb-2">
            <input type="text" name="dob" placeholder="Date Of Birth" class="form-control mb-2">
            <input type="text" name="motherTongue" placeholder="Mother Tongue" class="form-control mb-2">
            <input type="text" name="religion" placeholder="Religion" class="form-control mb-2">
            <input type="text" name="caste" placeholder="Caste" class="form-control mb-2">
            <input type="text" name="complexion" placeholder="Complexion" class="form-control mb-2">
            <input type="number" name="height" placeholder="Height" class="form-control mb-2">
            <input type="number" name="weight" placeholder="Weight" class="form-control mb-2">
            <input type="text" name="bloodGroup" placeholder="Blood Group" class="form-control mb-2">
            <input type="text" name="diseases" placeholder="Known Diseases" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Contact Information</legend>
            <input type="number" name="mobile" placeholder="Mobile No" class="form-control mb-2">
            <input type="text" name="nativePlace" placeholder="Native Place" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Identity Documents</legend>
            <input type="number" name="aadhar" placeholder="Aadhar No" class="form-control mb-2">
            <input type="text" name="pancard" placeholder="PanCard" class="form-control mb-2">
            <input type="text" name="voterId" placeholder="Voter Id" class="form-control mb-2">
            <input type="text" name="passport" placeholder="Passport No" class="form-control mb-2">
            <input type="text" name="rationCard" placeholder="Ration Card No" class="form-control mb-2">
            <input type="text" name="rtc" placeholder="RTC No" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Family Information</legend>
            <input type="number" name="children" placeholder="No Of Children" class="form-control mb-2">
            <input type="number" name="familyMembers" placeholder="No Of Family Members" class="form-control mb-2">
            <input type="text" name="friends" placeholder="Friends Name" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Property Information</legend>
            <input type="number" name="land" placeholder="Land in Acres" class="form-control mb-2">
            <input type="number" name="sites" placeholder="Total Sites" class="form-control mb-2">
            <input type="text" name="ownerName" placeholder="Building Owner Name" class="form-control mb-2">
            <input type="text" name="crop" placeholder="Crop" class="form-control mb-2">
            <input type="number" name="gold" placeholder="Gold in Grams" class="form-control mb-2">
            <input type="number" name="silver" placeholder="Silver in Grams" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Vehicle Details</legend>
            <input type="text" name="bike" placeholder="Bike Number" class="form-control mb-2">
            <input type="text" name="car" placeholder="Car Number" class="form-control mb-2">
            <input type="number" name="cycles" placeholder="No Of Cycles" class="form-control mb-2">
            <input type="number" name="shoes" placeholder="No Of Shoes" class="form-control mb-2">
            <input type="number" name="shoeSize" placeholder="Shoe Size" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Financial Info</legend>
            <input type="number" name="income" placeholder="Income" class="form-control mb-2">
            <input type="number" name="bank" placeholder="Bank Account" class="form-control mb-2">
            <input type="number" name="loanNo" placeholder="Loan No" class="form-control mb-2">
            <input type="number" name="loanBalance" placeholder="Loan Balance" class="form-control mb-2">
            <input type="text" name="loanType" placeholder="Loan Type" class="form-control mb-2">
            <input type="number" name="taxes" placeholder="Taxes Paid" class="form-control mb-2">
            <input type="number" name="shares" placeholder="Share Holding" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Insurance</legend>
            <input type="text" name="insuranceCompany" placeholder="Insurance Company" class="form-control mb-2">
            <input type="number" name="insuranceNo" placeholder="Insurance No" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Electronics</legend>
            <input type="text" name="laptop" placeholder="Laptop Model" class="form-control mb-2">
            <input type="text" name="tv" placeholder="TV Model" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Bills</legend>
            <input type="number" name="electricity" placeholder="Electricity Bill No" class="form-control mb-2">
            <input type="number" name="waterBill" placeholder="Water Bill No" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Employment</legend>
            <input type="text" name="occupation" placeholder="Occupation" class="form-control mb-2">
            <input type="text" name="govEmployee" placeholder="Govt Employee" class="form-control mb-2">
            <input type="text" name="disabled" placeholder="Disabled" class="form-control mb-2">
        </fieldset>


        <fieldset class="mb-3">
            <legend>Animals</legend>
            <input type="text" name="pet" placeholder="Pet Name" class="form-control mb-2">
            <input type="number" name="cows" placeholder="No Of Cows" class="form-control mb-2">
        </fieldset>

        <div class="text-center">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>

    </form>
</div>

</body>
</html>
