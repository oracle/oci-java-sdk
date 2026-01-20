/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the deployment wallets operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeploymentWalletsOperationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeploymentWalletsOperationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "walletOperationId",
        "walletSecretId",
        "deploymentWalletOperationType",
        "deploymentWalletOperationStatus",
        "timeStarted",
        "timeCompleted"
    })
    public DeploymentWalletsOperationSummary(
            String walletOperationId,
            String walletSecretId,
            DeploymentWalletOperationType deploymentWalletOperationType,
            DeploymentWalletStatus deploymentWalletOperationStatus,
            java.util.Date timeStarted,
            java.util.Date timeCompleted) {
        super();
        this.walletOperationId = walletOperationId;
        this.walletSecretId = walletSecretId;
        this.deploymentWalletOperationType = deploymentWalletOperationType;
        this.deploymentWalletOperationStatus = deploymentWalletOperationStatus;
        this.timeStarted = timeStarted;
        this.timeCompleted = timeCompleted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The UUID of the wallet operation performed by the customer. If provided, this will
         * reference a key which the customer can use to query or search a particular wallet
         * operation
         */
        @com.fasterxml.jackson.annotation.JsonProperty("walletOperationId")
        private String walletOperationId;

        /**
         * The UUID of the wallet operation performed by the customer. If provided, this will
         * reference a key which the customer can use to query or search a particular wallet
         * operation
         *
         * @param walletOperationId the value to set
         * @return this builder
         */
        public Builder walletOperationId(String walletOperationId) {
            this.walletOperationId = walletOperationId;
            this.__explicitlySet__.add("walletOperationId");
            return this;
        }
        /**
         * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key
         * that customers will be required to ensure the policies are established to permit
         * GoldenGate to use this Secret.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("walletSecretId")
        private String walletSecretId;

        /**
         * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key
         * that customers will be required to ensure the policies are established to permit
         * GoldenGate to use this Secret.
         *
         * @param walletSecretId the value to set
         * @return this builder
         */
        public Builder walletSecretId(String walletSecretId) {
            this.walletSecretId = walletSecretId;
            this.__explicitlySet__.add("walletSecretId");
            return this;
        }
        /** The operation type of the deployment wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentWalletOperationType")
        private DeploymentWalletOperationType deploymentWalletOperationType;

        /**
         * The operation type of the deployment wallet.
         *
         * @param deploymentWalletOperationType the value to set
         * @return this builder
         */
        public Builder deploymentWalletOperationType(
                DeploymentWalletOperationType deploymentWalletOperationType) {
            this.deploymentWalletOperationType = deploymentWalletOperationType;
            this.__explicitlySet__.add("deploymentWalletOperationType");
            return this;
        }
        /** The status of the deployment wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentWalletOperationStatus")
        private DeploymentWalletStatus deploymentWalletOperationStatus;

        /**
         * The status of the deployment wallet.
         *
         * @param deploymentWalletOperationStatus the value to set
         * @return this builder
         */
        public Builder deploymentWalletOperationStatus(
                DeploymentWalletStatus deploymentWalletOperationStatus) {
            this.deploymentWalletOperationStatus = deploymentWalletOperationStatus;
            this.__explicitlySet__.add("deploymentWalletOperationStatus");
            return this;
        }
        /**
         * The date and time the request was started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the request was started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the request was finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date and time the request was finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeCompleted the value to set
         * @return this builder
         */
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentWalletsOperationSummary build() {
            DeploymentWalletsOperationSummary model =
                    new DeploymentWalletsOperationSummary(
                            this.walletOperationId,
                            this.walletSecretId,
                            this.deploymentWalletOperationType,
                            this.deploymentWalletOperationStatus,
                            this.timeStarted,
                            this.timeCompleted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentWalletsOperationSummary model) {
            if (model.wasPropertyExplicitlySet("walletOperationId")) {
                this.walletOperationId(model.getWalletOperationId());
            }
            if (model.wasPropertyExplicitlySet("walletSecretId")) {
                this.walletSecretId(model.getWalletSecretId());
            }
            if (model.wasPropertyExplicitlySet("deploymentWalletOperationType")) {
                this.deploymentWalletOperationType(model.getDeploymentWalletOperationType());
            }
            if (model.wasPropertyExplicitlySet("deploymentWalletOperationStatus")) {
                this.deploymentWalletOperationStatus(model.getDeploymentWalletOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The UUID of the wallet operation performed by the customer. If provided, this will reference
     * a key which the customer can use to query or search a particular wallet operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("walletOperationId")
    private final String walletOperationId;

    /**
     * The UUID of the wallet operation performed by the customer. If provided, this will reference
     * a key which the customer can use to query or search a particular wallet operation
     *
     * @return the value
     */
    public String getWalletOperationId() {
        return walletOperationId;
    }

    /**
     * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key that
     * customers will be required to ensure the policies are established to permit GoldenGate to use
     * this Secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("walletSecretId")
    private final String walletSecretId;

    /**
     * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key that
     * customers will be required to ensure the policies are established to permit GoldenGate to use
     * this Secret.
     *
     * @return the value
     */
    public String getWalletSecretId() {
        return walletSecretId;
    }

    /** The operation type of the deployment wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentWalletOperationType")
    private final DeploymentWalletOperationType deploymentWalletOperationType;

    /**
     * The operation type of the deployment wallet.
     *
     * @return the value
     */
    public DeploymentWalletOperationType getDeploymentWalletOperationType() {
        return deploymentWalletOperationType;
    }

    /** The status of the deployment wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentWalletOperationStatus")
    private final DeploymentWalletStatus deploymentWalletOperationStatus;

    /**
     * The status of the deployment wallet.
     *
     * @return the value
     */
    public DeploymentWalletStatus getDeploymentWalletOperationStatus() {
        return deploymentWalletOperationStatus;
    }

    /**
     * The date and time the request was started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the request was started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the request was finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date and time the request was finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeploymentWalletsOperationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("walletOperationId=").append(String.valueOf(this.walletOperationId));
        sb.append(", walletSecretId=").append(String.valueOf(this.walletSecretId));
        sb.append(", deploymentWalletOperationType=")
                .append(String.valueOf(this.deploymentWalletOperationType));
        sb.append(", deploymentWalletOperationStatus=")
                .append(String.valueOf(this.deploymentWalletOperationStatus));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentWalletsOperationSummary)) {
            return false;
        }

        DeploymentWalletsOperationSummary other = (DeploymentWalletsOperationSummary) o;
        return java.util.Objects.equals(this.walletOperationId, other.walletOperationId)
                && java.util.Objects.equals(this.walletSecretId, other.walletSecretId)
                && java.util.Objects.equals(
                        this.deploymentWalletOperationType, other.deploymentWalletOperationType)
                && java.util.Objects.equals(
                        this.deploymentWalletOperationStatus, other.deploymentWalletOperationStatus)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.walletOperationId == null ? 43 : this.walletOperationId.hashCode());
        result =
                (result * PRIME)
                        + (this.walletSecretId == null ? 43 : this.walletSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentWalletOperationType == null
                                ? 43
                                : this.deploymentWalletOperationType.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentWalletOperationStatus == null
                                ? 43
                                : this.deploymentWalletOperationStatus.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
