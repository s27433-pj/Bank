package com.example.s27433Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S27433BankApplication {
	public void s27433BankApplication(TransferService transferService, ClientStorage clientStorage){
		System.out.println(transferService.sendMoney("1", 1500));
		System.out.println(transferService.addMoney("2", 3000));

		System.out.println(transferService.sendMoney("1", 50000));

		clientStorage.registerClient(new Client("6","Blazej",7700));
		System.out.println(clientStorage.getClientList());
	}


	public static void main(String[] args) {
		SpringApplication.run(S27433BankApplication.class, args);


	}


}
