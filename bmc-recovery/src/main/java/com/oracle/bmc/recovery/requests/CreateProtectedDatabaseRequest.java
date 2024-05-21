/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.requests;

import com.oracle.bmc.recovery.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/recovery/CreateProtectedDatabaseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateProtectedDatabaseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class CreateProtectedDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails> {

    /**
     * Describes the parameters required to create a protected database.
     */
    private com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails
            createProtectedDatabaseDetails;

    /**
     * Describes the parameters required to create a protected database.
     */
    public com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails
            getCreateProtectedDatabaseDetails() {
        return createProtectedDatabaseDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Indicates if the request is to test the preparedness for creating a protected database, without actually creating a protected database.
     * <p>
     * If you set the {@code opcDryRun} option as {@code true}, then Recovery Service only performs a test run to check for any missing prerequisites or configurations required to create a protected database, and then returns error messages to warn you about any missing requirements.
     * <p>
     * If an error occurs, you can review, correct, and repeat the dry run until the {@code createProtectedDatabase} request does not return any errors.
     * <p>
     * These are the common issues that you can identify by performing a dry run of the {@code createProtectedDatabase} request:
     * <p>
     * The Recovery Service subnet has insufficient free IP addresses to support the required number of private endpoints. See, [troubleshooting](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/troubleshoot-backup-failures-recovery-service.html#GUID-05FA08B8-421D-4E52-B84B-7AFB84ADECF9) information
     * * Recovery Service does not have permissions to manage the network resources in a chosen compartment
     * * Recovery Service is out of capacity. See, [Service Limits](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/servicelimits.htm) for more information
     * * Recovery Service resources exceed quota limits
     * * A protected database, having the same database ID, already exists
     * * The specified protection policy does not exist, or it is not in an Active state
     * * The specified Recovery Service subnet does not exist, or it is not in an Active state
     * <p>
     * See, [Prerequisites for Using Recovery Service](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/backup-recover-recovery-service.html#GUID-B2ABF281-DFF8-4A4E-AC85-629801AAF36A) for more information.
     *
     */
    private Boolean opcDryRun;

    /**
     * Indicates if the request is to test the preparedness for creating a protected database, without actually creating a protected database.
     * <p>
     * If you set the {@code opcDryRun} option as {@code true}, then Recovery Service only performs a test run to check for any missing prerequisites or configurations required to create a protected database, and then returns error messages to warn you about any missing requirements.
     * <p>
     * If an error occurs, you can review, correct, and repeat the dry run until the {@code createProtectedDatabase} request does not return any errors.
     * <p>
     * These are the common issues that you can identify by performing a dry run of the {@code createProtectedDatabase} request:
     * <p>
     * The Recovery Service subnet has insufficient free IP addresses to support the required number of private endpoints. See, [troubleshooting](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/troubleshoot-backup-failures-recovery-service.html#GUID-05FA08B8-421D-4E52-B84B-7AFB84ADECF9) information
     * * Recovery Service does not have permissions to manage the network resources in a chosen compartment
     * * Recovery Service is out of capacity. See, [Service Limits](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/servicelimits.htm) for more information
     * * Recovery Service resources exceed quota limits
     * * A protected database, having the same database ID, already exists
     * * The specified protection policy does not exist, or it is not in an Active state
     * * The specified Recovery Service subnet does not exist, or it is not in an Active state
     * <p>
     * See, [Prerequisites for Using Recovery Service](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/backup-recover-recovery-service.html#GUID-B2ABF281-DFF8-4A4E-AC85-629801AAF36A) for more information.
     *
     */
    public Boolean getOpcDryRun() {
        return opcDryRun;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails getBody$() {
        return createProtectedDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateProtectedDatabaseRequest,
                    com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Describes the parameters required to create a protected database.
         */
        private com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails
                createProtectedDatabaseDetails = null;

        /**
         * Describes the parameters required to create a protected database.
         * @param createProtectedDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder createProtectedDatabaseDetails(
                com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails
                        createProtectedDatabaseDetails) {
            this.createProtectedDatabaseDetails = createProtectedDatabaseDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Indicates if the request is to test the preparedness for creating a protected database, without actually creating a protected database.
         * <p>
         * If you set the {@code opcDryRun} option as {@code true}, then Recovery Service only performs a test run to check for any missing prerequisites or configurations required to create a protected database, and then returns error messages to warn you about any missing requirements.
         * <p>
         * If an error occurs, you can review, correct, and repeat the dry run until the {@code createProtectedDatabase} request does not return any errors.
         * <p>
         * These are the common issues that you can identify by performing a dry run of the {@code createProtectedDatabase} request:
         * <p>
         * The Recovery Service subnet has insufficient free IP addresses to support the required number of private endpoints. See, [troubleshooting](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/troubleshoot-backup-failures-recovery-service.html#GUID-05FA08B8-421D-4E52-B84B-7AFB84ADECF9) information
         * * Recovery Service does not have permissions to manage the network resources in a chosen compartment
         * * Recovery Service is out of capacity. See, [Service Limits](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/servicelimits.htm) for more information
         * * Recovery Service resources exceed quota limits
         * * A protected database, having the same database ID, already exists
         * * The specified protection policy does not exist, or it is not in an Active state
         * * The specified Recovery Service subnet does not exist, or it is not in an Active state
         * <p>
         * See, [Prerequisites for Using Recovery Service](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/backup-recover-recovery-service.html#GUID-B2ABF281-DFF8-4A4E-AC85-629801AAF36A) for more information.
         *
         */
        private Boolean opcDryRun = null;

        /**
         * Indicates if the request is to test the preparedness for creating a protected database, without actually creating a protected database.
         * <p>
         * If you set the {@code opcDryRun} option as {@code true}, then Recovery Service only performs a test run to check for any missing prerequisites or configurations required to create a protected database, and then returns error messages to warn you about any missing requirements.
         * <p>
         * If an error occurs, you can review, correct, and repeat the dry run until the {@code createProtectedDatabase} request does not return any errors.
         * <p>
         * These are the common issues that you can identify by performing a dry run of the {@code createProtectedDatabase} request:
         * <p>
         * The Recovery Service subnet has insufficient free IP addresses to support the required number of private endpoints. See, [troubleshooting](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/troubleshoot-backup-failures-recovery-service.html#GUID-05FA08B8-421D-4E52-B84B-7AFB84ADECF9) information
         * * Recovery Service does not have permissions to manage the network resources in a chosen compartment
         * * Recovery Service is out of capacity. See, [Service Limits](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/servicelimits.htm) for more information
         * * Recovery Service resources exceed quota limits
         * * A protected database, having the same database ID, already exists
         * * The specified protection policy does not exist, or it is not in an Active state
         * * The specified Recovery Service subnet does not exist, or it is not in an Active state
         * <p>
         * See, [Prerequisites for Using Recovery Service](https://docs.oracle.com/en/cloud/paas/recovery-service/dbrsu/backup-recover-recovery-service.html#GUID-B2ABF281-DFF8-4A4E-AC85-629801AAF36A) for more information.
         *
         * @param opcDryRun the value to set
         * @return this builder instance
         */
        public Builder opcDryRun(Boolean opcDryRun) {
            this.opcDryRun = opcDryRun;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateProtectedDatabaseRequest o) {
            createProtectedDatabaseDetails(o.getCreateProtectedDatabaseDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            opcDryRun(o.getOpcDryRun());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateProtectedDatabaseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateProtectedDatabaseRequest
         */
        public CreateProtectedDatabaseRequest build() {
            CreateProtectedDatabaseRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.recovery.model.CreateProtectedDatabaseDetails body) {
            createProtectedDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateProtectedDatabaseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateProtectedDatabaseRequest
         */
        public CreateProtectedDatabaseRequest buildWithoutInvocationCallback() {
            CreateProtectedDatabaseRequest request = new CreateProtectedDatabaseRequest();
            request.createProtectedDatabaseDetails = createProtectedDatabaseDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.opcDryRun = opcDryRun;
            return request;
            // new CreateProtectedDatabaseRequest(createProtectedDatabaseDetails, opcRetryToken, opcRequestId, opcDryRun);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createProtectedDatabaseDetails(createProtectedDatabaseDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .opcDryRun(opcDryRun);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",createProtectedDatabaseDetails=")
                .append(String.valueOf(this.createProtectedDatabaseDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcDryRun=").append(String.valueOf(this.opcDryRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateProtectedDatabaseRequest)) {
            return false;
        }

        CreateProtectedDatabaseRequest other = (CreateProtectedDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createProtectedDatabaseDetails, other.createProtectedDatabaseDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcDryRun, other.opcDryRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createProtectedDatabaseDetails == null
                                ? 43
                                : this.createProtectedDatabaseDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcDryRun == null ? 43 : this.opcDryRun.hashCode());
        return result;
    }
}
