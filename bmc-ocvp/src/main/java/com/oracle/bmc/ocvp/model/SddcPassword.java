/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * SDDC vCenter/NSX/HCX password.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SddcPassword.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SddcPassword extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"passwordType", "value"})
    public SddcPassword(PasswordTypes passwordType, String value) {
        super();
        this.passwordType = passwordType;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SDDC password type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordType")
        private PasswordTypes passwordType;

        /**
         * SDDC password type.
         * @param passwordType the value to set
         * @return this builder
         **/
        public Builder passwordType(PasswordTypes passwordType) {
            this.passwordType = passwordType;
            this.__explicitlySet__.add("passwordType");
            return this;
        }
        /**
         * SDDC vCenter/NSX/HCX password context.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * SDDC vCenter/NSX/HCX password context.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SddcPassword build() {
            SddcPassword model = new SddcPassword(this.passwordType, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SddcPassword model) {
            if (model.wasPropertyExplicitlySet("passwordType")) {
                this.passwordType(model.getPasswordType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * SDDC password type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordType")
    private final PasswordTypes passwordType;

    /**
     * SDDC password type.
     * @return the value
     **/
    public PasswordTypes getPasswordType() {
        return passwordType;
    }

    /**
     * SDDC vCenter/NSX/HCX password context.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * SDDC vCenter/NSX/HCX password context.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SddcPassword(");
        sb.append("super=").append(super.toString());
        sb.append("passwordType=").append(String.valueOf(this.passwordType));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SddcPassword)) {
            return false;
        }

        SddcPassword other = (SddcPassword) o;
        return java.util.Objects.equals(this.passwordType, other.passwordType)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.passwordType == null ? 43 : this.passwordType.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
