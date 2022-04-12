package bootcamp.microservices.app.accounts.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.microservices.app.accounts.repository.AccountRepository;

@Component
public class Validation {

	@Autowired
	private AccountRepository accountRepository;

	public Boolean createAccountValidation(String idClient) {
		Boolean createAccount = false;
		Long accountQuaty = accountRepository.findByIdClient(idClient).count().block();
		if (accountQuaty == 0) {
			createAccount = true;
		}
		return createAccount;
	}
}
