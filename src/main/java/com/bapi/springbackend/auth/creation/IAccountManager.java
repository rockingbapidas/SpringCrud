package com.bapi.springbackend.auth.creation;


public interface IAccountManager {
    Account createAccount(CreateAccount createAccount) throws Throwable;
    boolean updateAccount(UpdateAccount updateAccount, Long accountId) throws Throwable;
    boolean deleteAccount(Long accountId) throws Throwable;
}
