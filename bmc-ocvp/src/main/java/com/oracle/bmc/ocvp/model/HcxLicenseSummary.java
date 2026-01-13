/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * HCX on-premise license information summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HcxLicenseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HcxLicenseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"activationKey", "status", "systemName"})
    public HcxLicenseSummary(String activationKey, HcxLicenseStatus status, String systemName) {
        super();
        this.activationKey = activationKey;
        this.status = status;
        this.systemName = systemName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** HCX on-premise license key value. */
        @com.fasterxml.jackson.annotation.JsonProperty("activationKey")
        private String activationKey;

        /**
         * HCX on-premise license key value.
         *
         * @param activationKey the value to set
         * @return this builder
         */
        public Builder activationKey(String activationKey) {
            this.activationKey = activationKey;
            this.__explicitlySet__.add("activationKey");
            return this;
        }
        /** status of HCX on-premise license. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private HcxLicenseStatus status;

        /**
         * status of HCX on-premise license.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(HcxLicenseStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Name of the system that consumed the HCX on-premise license */
        @com.fasterxml.jackson.annotation.JsonProperty("systemName")
        private String systemName;

        /**
         * Name of the system that consumed the HCX on-premise license
         *
         * @param systemName the value to set
         * @return this builder
         */
        public Builder systemName(String systemName) {
            this.systemName = systemName;
            this.__explicitlySet__.add("systemName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HcxLicenseSummary build() {
            HcxLicenseSummary model =
                    new HcxLicenseSummary(this.activationKey, this.status, this.systemName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HcxLicenseSummary model) {
            if (model.wasPropertyExplicitlySet("activationKey")) {
                this.activationKey(model.getActivationKey());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("systemName")) {
                this.systemName(model.getSystemName());
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

    /** HCX on-premise license key value. */
    @com.fasterxml.jackson.annotation.JsonProperty("activationKey")
    private final String activationKey;

    /**
     * HCX on-premise license key value.
     *
     * @return the value
     */
    public String getActivationKey() {
        return activationKey;
    }

    /** status of HCX on-premise license. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final HcxLicenseStatus status;

    /**
     * status of HCX on-premise license.
     *
     * @return the value
     */
    public HcxLicenseStatus getStatus() {
        return status;
    }

    /** Name of the system that consumed the HCX on-premise license */
    @com.fasterxml.jackson.annotation.JsonProperty("systemName")
    private final String systemName;

    /**
     * Name of the system that consumed the HCX on-premise license
     *
     * @return the value
     */
    public String getSystemName() {
        return systemName;
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
        sb.append("HcxLicenseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("activationKey=").append(String.valueOf(this.activationKey));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", systemName=").append(String.valueOf(this.systemName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HcxLicenseSummary)) {
            return false;
        }

        HcxLicenseSummary other = (HcxLicenseSummary) o;
        return java.util.Objects.equals(this.activationKey, other.activationKey)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.systemName, other.systemName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activationKey == null ? 43 : this.activationKey.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.systemName == null ? 43 : this.systemName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
