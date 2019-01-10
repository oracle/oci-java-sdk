/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.loadbalancer.LoadBalancerClient;
import com.oracle.bmc.loadbalancer.model.AddHttpRequestHeaderRule;
import com.oracle.bmc.loadbalancer.model.AddHttpResponseHeaderRule;
import com.oracle.bmc.loadbalancer.model.CreateListenerDetails;
import com.oracle.bmc.loadbalancer.model.CreateRuleSetDetails;
import com.oracle.bmc.loadbalancer.model.ExtendHttpRequestHeaderValueRule;
import com.oracle.bmc.loadbalancer.model.ExtendHttpResponseHeaderValueRule;
import com.oracle.bmc.loadbalancer.model.RemoveHttpRequestHeaderRule;
import com.oracle.bmc.loadbalancer.model.RemoveHttpResponseHeaderRule;
import com.oracle.bmc.loadbalancer.model.Rule;
import com.oracle.bmc.loadbalancer.model.RuleSet;
import com.oracle.bmc.loadbalancer.requests.CreateListenerRequest;
import com.oracle.bmc.loadbalancer.requests.CreateRuleSetRequest;
import com.oracle.bmc.loadbalancer.requests.GetRuleSetRequest;
import com.oracle.bmc.loadbalancer.requests.GetWorkRequestRequest;
import com.oracle.bmc.loadbalancer.responses.CreateListenerResponse;
import com.oracle.bmc.loadbalancer.responses.CreateRuleSetResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateLoadBalancerRuleSetExample {
    /**
     * Please refer to https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/latest/RuleSet/CreateRuleSet
     * for information about using the API to create a rule set.
     * This example requires an existing LoadBalancer and it will do the following
     * 1) Create new rule set.
     * 2) Create a new listener with a reference to the new rule set.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // TODO: Fill in these values
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        String loadBalancerId = "SOME OCID";
        String ruleSetName = "SOME RULE SET NAME";

        int listenerPort = 80;
        String listenerName = "SOME LISTENER NAME";
        String backendSetName = "SOME BACKEND SET NAME";
        String listenerProtocol =
                "HTTP"; // Rules in this example are applicable to HTTP or HTTP2 protocols

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        LoadBalancerClient loadBalancerClient = new LoadBalancerClient(provider);

        System.out.println("Creating new rule set " + ruleSetName + "...");

        RuleSet ruleSet = createRuleSet(loadBalancerClient, loadBalancerId, ruleSetName);

        System.out.println("Rule set " + ruleSetName + " is created...");

        System.out.println(
                "Creating new listener " + listenerName + " with rule set " + ruleSetName + "...");

        createListener(
                loadBalancerClient,
                loadBalancerId,
                listenerPort,
                listenerName,
                backendSetName,
                listenerProtocol,
                ruleSet);

        System.out.println(
                "Listener " + listenerName + " with rule set " + ruleSetName + " is created...");

        loadBalancerClient.close();
    }

    private static RuleSet createRuleSet(
            LoadBalancerClient loadBalancerClient, String loadBalancerId, String ruleSetName) {
        List<Rule> rules = new ArrayList<>();
        rules.add(
                AddHttpRequestHeaderRule.builder()
                        .header("someRequestHeader")
                        .value("Some static value")
                        .build());
        rules.add(
                ExtendHttpRequestHeaderValueRule.builder()
                        .header("someRequestHeader")
                        .prefix("Some static prefix value")
                        .suffix("Some static sufix value")
                        .build());
        rules.add(RemoveHttpRequestHeaderRule.builder().header("someRequestHeader").build());
        rules.add(
                AddHttpResponseHeaderRule.builder()
                        .header("someResponseHeader")
                        .value("Some static value")
                        .build());
        rules.add(
                ExtendHttpResponseHeaderValueRule.builder()
                        .header("someResponseHeader")
                        .prefix("Some static prefix value")
                        .suffix("Some static sufix value")
                        .build());
        rules.add(RemoveHttpResponseHeaderRule.builder().header("someResponseHeader").build());

        CreateRuleSetResponse response =
                loadBalancerClient.createRuleSet(
                        CreateRuleSetRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .createRuleSetDetails(
                                        CreateRuleSetDetails.builder()
                                                .name(ruleSetName)
                                                .items(rules)
                                                .build())
                                .build());

        loadBalancerClient
                .getWaiters()
                .forWorkRequest(
                        GetWorkRequestRequest.builder()
                                .workRequestId(response.getOpcWorkRequestId())
                                .build());

        return loadBalancerClient
                .getRuleSet(
                        GetRuleSetRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .ruleSetName(ruleSetName)
                                .build())
                .getRuleSet();
    }

    private static void createListener(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            int listenerPort,
            String listenerName,
            String backendSetName,
            String listenerProtocol,
            RuleSet ruleSet) {
        CreateListenerResponse response =
                loadBalancerClient.createListener(
                        CreateListenerRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .createListenerDetails(
                                        CreateListenerDetails.builder()
                                                .name(listenerName)
                                                .defaultBackendSetName(backendSetName)
                                                .port(listenerPort)
                                                .protocol(listenerProtocol)
                                                .ruleSetNames(
                                                        Collections.singletonList(
                                                                ruleSet.getName()))
                                                .build())
                                .build());
        loadBalancerClient
                .getWaiters()
                .forWorkRequest(
                        GetWorkRequestRequest.builder()
                                .workRequestId(response.getOpcWorkRequestId())
                                .build());
    }
}
