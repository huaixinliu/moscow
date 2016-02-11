package com.github.macdao.moscow;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.nio.file.Paths;

public class ContractAssertionTest {
    private final ContractContainer contractContainer = new ContractContainer(Paths.get("src/test/resources/contracts"));

    @Rule
    public final TestName name = new TestName();

    @Test
    public void should_response_text_foo() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }

    @Test
    public void request_text_foo_should_response_text_bar() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }

    @Test(expected = RuntimeException.class)
    public void bad_contract_name() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }

    @Test
    public void request_file_should_response_text_bar2() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }

    @Test
    public void request_uri_foo_should_response_bar3() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }

    @Test
    public void request_param_should_response_bar4() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }

    @Test
    public void request_put_foo2_should_response_bar3() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }

    @Test
    public void request_json_should_response_bar4() throws Exception {
        new ContractAssertion(contractContainer.findContracts(name.getMethodName()))
                .setPort(12306)
                .assertContract();
    }
}