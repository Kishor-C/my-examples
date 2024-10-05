package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Account;
import com.example.beans.Contact;
import com.example.beans.Profile;
import com.example.beans.Wallet;
import com.example.dao.AccountDao;
import com.example.dao.ContactDao;
import com.example.dao.ProfileDao;
import com.example.dao.WalletDao;

import jakarta.transaction.Transactional;

@Service
public class ProfileServiceImpl {

	@Autowired
	private ProfileDao profileDao;
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private WalletDao walletDao;
	
	@Autowired
	private ContactDao contactDao;
	
	@Transactional
	public Profile save(Profile profile) {
		Account account = new Account(0, 5000);
		profile.setWalletIdRef(new Wallet(0, 500, account));
		Profile profileCreated = profileDao.save(profile);
		return profileCreated;
	}
	
	
}
