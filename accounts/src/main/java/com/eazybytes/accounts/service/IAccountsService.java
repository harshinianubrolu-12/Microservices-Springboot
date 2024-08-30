package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    void create(CustomerDto customerDto);
    CustomerDto fetchdetails(String mobileNumber);
    boolean update(CustomerDto customerDto);
    boolean deletedetails(String mobileNumber);
}
