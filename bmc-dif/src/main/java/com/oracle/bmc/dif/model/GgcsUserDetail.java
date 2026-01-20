/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Ggcs user credentials to be created or updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GgcsUserDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GgcsUserDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"userName", "secretId", "userType", "action"})
    public GgcsUserDetail(
            String userName, String secretId, String userType, WorkflowAction action) {
        super();
        this.userName = userName;
        this.secretId = secretId;
        this.userType = userType;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** username for the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * username for the user.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** Vault OCID containing password for existing or new user. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * Vault OCID containing password for existing or new user.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /** Type of GoldenGate user. Allowed values are "OPERATOR". */
        @com.fasterxml.jackson.annotation.JsonProperty("userType")
        private String userType;

        /**
         * Type of GoldenGate user. Allowed values are "OPERATOR".
         *
         * @param userType the value to set
         * @return this builder
         */
        public Builder userType(String userType) {
            this.userType = userType;
            this.__explicitlySet__.add("userType");
            return this;
        }
        /** Action to be done over the user. Allowed values are "CREATE" or "UPDATE". */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private WorkflowAction action;

        /**
         * Action to be done over the user. Allowed values are "CREATE" or "UPDATE".
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(WorkflowAction action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GgcsUserDetail build() {
            GgcsUserDetail model =
                    new GgcsUserDetail(this.userName, this.secretId, this.userType, this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GgcsUserDetail model) {
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("userType")) {
                this.userType(model.getUserType());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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

    /** username for the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * username for the user.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** Vault OCID containing password for existing or new user. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * Vault OCID containing password for existing or new user.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /** Type of GoldenGate user. Allowed values are "OPERATOR". */
    @com.fasterxml.jackson.annotation.JsonProperty("userType")
    private final String userType;

    /**
     * Type of GoldenGate user. Allowed values are "OPERATOR".
     *
     * @return the value
     */
    public String getUserType() {
        return userType;
    }

    /** Action to be done over the user. Allowed values are "CREATE" or "UPDATE". */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final WorkflowAction action;

    /**
     * Action to be done over the user. Allowed values are "CREATE" or "UPDATE".
     *
     * @return the value
     */
    public WorkflowAction getAction() {
        return action;
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
        sb.append("GgcsUserDetail(");
        sb.append("super=").append(super.toString());
        sb.append("userName=").append(String.valueOf(this.userName));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", userType=").append(String.valueOf(this.userType));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GgcsUserDetail)) {
            return false;
        }

        GgcsUserDetail other = (GgcsUserDetail) o;
        return java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.userType, other.userType)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.userType == null ? 43 : this.userType.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
