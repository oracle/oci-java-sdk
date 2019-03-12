/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.budget.BudgetClient;
import com.oracle.bmc.budget.BudgetPaginators;
import com.oracle.bmc.budget.model.AlertRule;
import com.oracle.bmc.budget.model.AlertRuleSummary;
import com.oracle.bmc.budget.model.AlertType;
import com.oracle.bmc.budget.model.Budget;
import com.oracle.bmc.budget.model.BudgetSummary;
import com.oracle.bmc.budget.model.CreateAlertRuleDetails;
import com.oracle.bmc.budget.model.CreateBudgetDetails;
import com.oracle.bmc.budget.model.ResetPeriod;
import com.oracle.bmc.budget.model.ThresholdType;
import com.oracle.bmc.budget.model.UpdateAlertRuleDetails;
import com.oracle.bmc.budget.model.UpdateBudgetDetails;
import com.oracle.bmc.budget.requests.CreateAlertRuleRequest;
import com.oracle.bmc.budget.requests.CreateBudgetRequest;
import com.oracle.bmc.budget.requests.DeleteAlertRuleRequest;
import com.oracle.bmc.budget.requests.DeleteBudgetRequest;
import com.oracle.bmc.budget.requests.GetAlertRuleRequest;
import com.oracle.bmc.budget.requests.GetBudgetRequest;
import com.oracle.bmc.budget.requests.ListAlertRulesRequest;
import com.oracle.bmc.budget.requests.ListBudgetsRequest;
import com.oracle.bmc.budget.requests.UpdateAlertRuleRequest;
import com.oracle.bmc.budget.requests.UpdateBudgetRequest;
import com.oracle.bmc.budget.responses.CreateAlertRuleResponse;
import com.oracle.bmc.budget.responses.CreateBudgetResponse;
import com.oracle.bmc.budget.responses.GetAlertRuleResponse;
import com.oracle.bmc.budget.responses.GetBudgetResponse;
import com.oracle.bmc.budget.responses.UpdateAlertRuleResponse;
import com.oracle.bmc.budget.responses.UpdateBudgetResponse;

import java.math.BigDecimal;

/**
 * This class provides an example of how you can create a budget and an alert rule on the budget. It then shows how to
 * perform updates, reads, and deletes. It will:
 * <ul>
 *   <li>Create a budget</li>
 *   <li>List budgets in the compartment</li>
 *   <li>Get a single budget (the one that was created above)</li>
 *   <li>Create an alert rule on the budget to trigger when forecast spend reaches 100% of the budget amount, specifically:</li>
 *   <ul>
 *     <li>type: FORECAST</li>
 *     <li>threshold: 100</li>
 *     <li>thresholdType: PERCENTAGE</li>
 *   </ul>
 *   <li>List alert rules in the budget</li>
 *   <li>Get a single alert rule (the one that was created above)</li>
 *   <li>Update the budget amount</li>
 *   <li>Update the alert rule threshold</li>
 *   <li>Delete the alert rule</li>
 *   <li>Delete the budget</li>
 * </ul>
 */
public class BudgetExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final int REQUIRED_ARGS_LENGTH = 4;
    private static final int ALL_ARGS_LENGTH = 7;

    private static com.oracle.bmc.budget.Budget budgetClient;

    /**
     * @param args Parameters to use for the budget service example are as follows:
     * <ul>
     *   <li>The 1st argument is the ocid of the compartment for the budget, which should be the tenancy root compartment.</li>
     *   <li>The 2nd is the target compartment for the budget, which should be in the same tenancy as the first.</li>
     *   <li>The 3rd is the amount for the budget, which should an unformatted number.</li>
     *   <li>The 4th is an email address to be used as the budget alert rule recipient.</li>
     *   <li>Optional params below may be left unspecified or fully specified, but not partially specified:</li>
     * </ul>
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length != REQUIRED_ARGS_LENGTH && args.length != ALL_ARGS_LENGTH) {
            throw new IllegalArgumentException(
                    "This example expects 4 arguments: compartment OCID, target compartment OCID, budget amount, alert rule recipient");
        }

        for (String arg : args) {
            System.out.println(arg);
        }

        String compartmentId = args[0];
        String targetCompartmentId = args[1];

        BigDecimal budgetAmount;
        try {
            budgetAmount = new BigDecimal(args[2]);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                    String.format("%s is not a valid budget amount", args[2]));
        }

        String alertRuleRecipient = args[3];
        BigDecimal threshold = new BigDecimal(100);
        ThresholdType thresholdType = ThresholdType.Percentage;
        AlertType alertType = AlertType.Forecast;

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);

        budgetClient = new BudgetClient(provider);

        // Create a budget
        CreateBudgetResponse createBudgetResponse =
                budgetClient.createBudget(
                        CreateBudgetRequest.builder()
                                .createBudgetDetails(
                                        CreateBudgetDetails.builder()
                                                .compartmentId(compartmentId)
                                                .targetCompartmentId(targetCompartmentId)
                                                .amount(budgetAmount)
                                                .resetPeriod(ResetPeriod.Monthly)
                                                .build())
                                .build());

        Budget budget = createBudgetResponse.getBudget();

        // List out all budgets in the compartment
        BudgetPaginators budgetPaginators = new BudgetPaginators(budgetClient);

        Iterable<BudgetSummary> budgetSummaries =
                budgetPaginators.listBudgetsRecordIterator(
                        ListBudgetsRequest.builder()
                                .compartmentId(compartmentId)
                                .limit(50)
                                .build());

        System.out.println(
                String.format("ListBudgets for compartment with OCID: %s", compartmentId));
        for (BudgetSummary budgetSummary : budgetSummaries) {
            System.out.println(budgetSummary);
        }

        // Get a single budget (the one we just created).
        System.out.println(String.format("GetBudget with OCID: %s", budget.getId()));
        GetBudgetResponse getBudgetResponse =
                budgetClient.getBudget(GetBudgetRequest.builder().budgetId(budget.getId()).build());

        System.out.println(getBudgetResponse.getBudget());

        // Create an alert rule on the budget
        CreateAlertRuleResponse createAlertRuleResponse =
                budgetClient.createAlertRule(
                        CreateAlertRuleRequest.builder()
                                .budgetId(budget.getId())
                                .createAlertRuleDetails(
                                        CreateAlertRuleDetails.builder()
                                                .threshold(threshold)
                                                .thresholdType(thresholdType)
                                                .type(alertType)
                                                .recipients(alertRuleRecipient)
                                                .build())
                                .build());

        AlertRule alertRule = createAlertRuleResponse.getAlertRule();

        // List out all alert rules in the budget
        Iterable<AlertRuleSummary> alertRuleSummaries =
                budgetPaginators.listAlertRulesRecordIterator(
                        ListAlertRulesRequest.builder().budgetId(budget.getId()).limit(10).build());

        System.out.println(
                String.format("ListAlertRules for budget with OCID: %s", budget.getId()));
        for (AlertRuleSummary alertRuleSummary : alertRuleSummaries) {
            System.out.println(alertRuleSummary);
        }

        // Get a single alert rule (the one we just created).
        System.out.println(String.format("GetAlertRule with OCID: %s", alertRule.getId()));
        GetAlertRuleResponse getAlertRuleResponse =
                budgetClient.getAlertRule(
                        GetAlertRuleRequest.builder()
                                .alertRuleId(alertRule.getId())
                                .budgetId(alertRule.getBudgetId())
                                .build());

        System.out.println(getAlertRuleResponse.getAlertRule());

        // Update the budget amount to increase it by 10%.
        BigDecimal newAmount = budgetAmount.multiply(new BigDecimal("1.1"));
        UpdateBudgetResponse updateBudgetResponse =
                budgetClient.updateBudget(
                        UpdateBudgetRequest.builder()
                                .budgetId(budget.getId())
                                .updateBudgetDetails(
                                        UpdateBudgetDetails.builder().amount(newAmount).build())
                                .build());

        budget = updateBudgetResponse.getBudget();
        System.out.println(
                String.format("New budget amount = %s", budget.getAmount().toPlainString()));

        // Update the alert rule to make it trigger at 80% of actual spend and add a message.
        UpdateAlertRuleResponse updateAlertRuleResponse =
                budgetClient.updateAlertRule(
                        UpdateAlertRuleRequest.builder()
                                .alertRuleId(alertRule.getId())
                                .budgetId(alertRule.getBudgetId())
                                .updateAlertRuleDetails(
                                        UpdateAlertRuleDetails.builder()
                                                .threshold(new BigDecimal(80))
                                                .type(AlertType.Actual)
                                                .message(
                                                        "Spending in your compartment has reached 80% of the compartment budget.")
                                                .build())
                                .build());

        alertRule = updateAlertRuleResponse.getAlertRule();
        System.out.println(
                String.format(
                        "New alert rule threshold = %s%%, type = %s",
                        alertRule.getThreshold().toPlainString(),
                        alertRule.getType().getValue()));

        // (Clean-up) Delete the alert rule
        budgetClient.deleteAlertRule(
                DeleteAlertRuleRequest.builder()
                        .alertRuleId(alertRule.getId())
                        .budgetId(alertRule.getBudgetId())
                        .build());

        // (Clean-up) Delete the budget
        // Note, this triggers a cascading delete of all alert rules in the budget, and would have deleted the alert rule above.
        budgetClient.deleteBudget(DeleteBudgetRequest.builder().budgetId(budget.getId()).build());
    }
}
