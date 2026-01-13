/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * This is CSP zone key reference <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CspZoneKeyReferenceId.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CspZoneKeyReferenceId
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"keyValue", "keyName"})
    public CspZoneKeyReferenceId(String keyValue, String keyName) {
        super();
        this.keyValue = keyValue;
        this.keyName = keyName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Value of keyName GcpProjectName: A human-readable name for your project. The project name
         * isn't used by any Google APIs. You can edit the project name at any time during or after
         * project creation. Project names do not need to be unique. AzureSubscriptionId: A unique
         * alphanumeric string that identifies your Azure subscription. AwsAccountId: a unique
         * 12-digit number that identifies an Amazon Web Services (AWS) account
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyValue")
        private String keyValue;

        /**
         * Value of keyName GcpProjectName: A human-readable name for your project. The project name
         * isn't used by any Google APIs. You can edit the project name at any time during or after
         * project creation. Project names do not need to be unique. AzureSubscriptionId: A unique
         * alphanumeric string that identifies your Azure subscription. AwsAccountId: a unique
         * 12-digit number that identifies an Amazon Web Services (AWS) account
         *
         * @param keyValue the value to set
         * @return this builder
         */
        public Builder keyValue(String keyValue) {
            this.keyValue = keyValue;
            this.__explicitlySet__.add("keyValue");
            return this;
        }
        /** KeyName for Azure=AzureSubscriptionId Aws=AwsAccountId GCP=GcpProjectName */
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * KeyName for Azure=AzureSubscriptionId Aws=AwsAccountId GCP=GcpProjectName
         *
         * @param keyName the value to set
         * @return this builder
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CspZoneKeyReferenceId build() {
            CspZoneKeyReferenceId model = new CspZoneKeyReferenceId(this.keyValue, this.keyName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CspZoneKeyReferenceId model) {
            if (model.wasPropertyExplicitlySet("keyValue")) {
                this.keyValue(model.getKeyValue());
            }
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
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
     * Value of keyName GcpProjectName: A human-readable name for your project. The project name
     * isn't used by any Google APIs. You can edit the project name at any time during or after
     * project creation. Project names do not need to be unique. AzureSubscriptionId: A unique
     * alphanumeric string that identifies your Azure subscription. AwsAccountId: a unique 12-digit
     * number that identifies an Amazon Web Services (AWS) account
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyValue")
    private final String keyValue;

    /**
     * Value of keyName GcpProjectName: A human-readable name for your project. The project name
     * isn't used by any Google APIs. You can edit the project name at any time during or after
     * project creation. Project names do not need to be unique. AzureSubscriptionId: A unique
     * alphanumeric string that identifies your Azure subscription. AwsAccountId: a unique 12-digit
     * number that identifies an Amazon Web Services (AWS) account
     *
     * @return the value
     */
    public String getKeyValue() {
        return keyValue;
    }

    /** KeyName for Azure=AzureSubscriptionId Aws=AwsAccountId GCP=GcpProjectName */
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * KeyName for Azure=AzureSubscriptionId Aws=AwsAccountId GCP=GcpProjectName
     *
     * @return the value
     */
    public String getKeyName() {
        return keyName;
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
        sb.append("CspZoneKeyReferenceId(");
        sb.append("super=").append(super.toString());
        sb.append("keyValue=").append(String.valueOf(this.keyValue));
        sb.append(", keyName=").append(String.valueOf(this.keyName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CspZoneKeyReferenceId)) {
            return false;
        }

        CspZoneKeyReferenceId other = (CspZoneKeyReferenceId) o;
        return java.util.Objects.equals(this.keyValue, other.keyValue)
                && java.util.Objects.equals(this.keyName, other.keyName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyValue == null ? 43 : this.keyValue.hashCode());
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
