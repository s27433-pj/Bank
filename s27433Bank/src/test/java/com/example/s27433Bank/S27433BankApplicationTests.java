package com.example.s27433Bank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class S27433BankApplicationTests {


	@Autowired
	private TransferService transferService;
	@Test
	void contextLoads() {
	}

	@Test
	void clientCanSendMoney() {
		//when
		Transfer transfer = transferService.sendMoney("1", 2000);
		//then
		Assertions.assertThat(transfer.getTransferType()).isEqualTo(TransferType.ACCEPTED);
	}

	@Test
	void clientCanNotSendMoney() {
		//when
		Transfer transfer =  transferService.sendMoney("1", 200000);
		//then
		Assertions.assertThat(transfer.getTransferType()).isEqualTo(TransferType.DECLINED);
	}

	@Test
	void clientCanAddMoney() {
		//when
		Transfer transfer =  transferService.addMoney("1", 2000);
		//then
		Assertions.assertThat(transfer.getTransferType()).isEqualTo(TransferType.ACCEPTED);
	}

	@Test
	void clientCanNotAddMoney() {
		//when
		Transfer transfer =  transferService.addMoney("1", -2000);
		//then
		Assertions.assertThat(transfer.getTransferType()).isEqualTo(TransferType.DECLINED);
	}






}
