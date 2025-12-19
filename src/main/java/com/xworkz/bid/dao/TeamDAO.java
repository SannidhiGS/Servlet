package com.xworkz.bid.dao;
public interface TeamDAO {
    boolean existsByEmail(String email) throws ClassNotFoundException;
}
