/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * Password policy, currently set for the given compartment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PasswordPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PasswordPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minimumPasswordLength",
        "isUppercaseCharactersRequired",
        "isLowercaseCharactersRequired",
        "isNumericCharactersRequired",
        "isSpecialCharactersRequired",
        "isUsernameContainmentAllowed"
    })
    public PasswordPolicy(
            Integer minimumPasswordLength,
            Boolean isUppercaseCharactersRequired,
            Boolean isLowercaseCharactersRequired,
            Boolean isNumericCharactersRequired,
            Boolean isSpecialCharactersRequired,
            Boolean isUsernameContainmentAllowed) {
        super();
        this.minimumPasswordLength = minimumPasswordLength;
        this.isUppercaseCharactersRequired = isUppercaseCharactersRequired;
        this.isLowercaseCharactersRequired = isLowercaseCharactersRequired;
        this.isNumericCharactersRequired = isNumericCharactersRequired;
        this.isSpecialCharactersRequired = isSpecialCharactersRequired;
        this.isUsernameContainmentAllowed = isUsernameContainmentAllowed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Minimum password length required. */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumPasswordLength")
        private Integer minimumPasswordLength;

        /**
         * Minimum password length required.
         *
         * @param minimumPasswordLength the value to set
         * @return this builder
         */
        public Builder minimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            this.__explicitlySet__.add("minimumPasswordLength");
            return this;
        }
        /** At least one uppercase character required. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUppercaseCharactersRequired")
        private Boolean isUppercaseCharactersRequired;

        /**
         * At least one uppercase character required.
         *
         * @param isUppercaseCharactersRequired the value to set
         * @return this builder
         */
        public Builder isUppercaseCharactersRequired(Boolean isUppercaseCharactersRequired) {
            this.isUppercaseCharactersRequired = isUppercaseCharactersRequired;
            this.__explicitlySet__.add("isUppercaseCharactersRequired");
            return this;
        }
        /** At least one lower case character required. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLowercaseCharactersRequired")
        private Boolean isLowercaseCharactersRequired;

        /**
         * At least one lower case character required.
         *
         * @param isLowercaseCharactersRequired the value to set
         * @return this builder
         */
        public Builder isLowercaseCharactersRequired(Boolean isLowercaseCharactersRequired) {
            this.isLowercaseCharactersRequired = isLowercaseCharactersRequired;
            this.__explicitlySet__.add("isLowercaseCharactersRequired");
            return this;
        }
        /** At least one numeric character required. */
        @com.fasterxml.jackson.annotation.JsonProperty("isNumericCharactersRequired")
        private Boolean isNumericCharactersRequired;

        /**
         * At least one numeric character required.
         *
         * @param isNumericCharactersRequired the value to set
         * @return this builder
         */
        public Builder isNumericCharactersRequired(Boolean isNumericCharactersRequired) {
            this.isNumericCharactersRequired = isNumericCharactersRequired;
            this.__explicitlySet__.add("isNumericCharactersRequired");
            return this;
        }
        /** At least one special character required. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSpecialCharactersRequired")
        private Boolean isSpecialCharactersRequired;

        /**
         * At least one special character required.
         *
         * @param isSpecialCharactersRequired the value to set
         * @return this builder
         */
        public Builder isSpecialCharactersRequired(Boolean isSpecialCharactersRequired) {
            this.isSpecialCharactersRequired = isSpecialCharactersRequired;
            this.__explicitlySet__.add("isSpecialCharactersRequired");
            return this;
        }
        /** User name is allowed to be part of the password. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUsernameContainmentAllowed")
        private Boolean isUsernameContainmentAllowed;

        /**
         * User name is allowed to be part of the password.
         *
         * @param isUsernameContainmentAllowed the value to set
         * @return this builder
         */
        public Builder isUsernameContainmentAllowed(Boolean isUsernameContainmentAllowed) {
            this.isUsernameContainmentAllowed = isUsernameContainmentAllowed;
            this.__explicitlySet__.add("isUsernameContainmentAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PasswordPolicy build() {
            PasswordPolicy model =
                    new PasswordPolicy(
                            this.minimumPasswordLength,
                            this.isUppercaseCharactersRequired,
                            this.isLowercaseCharactersRequired,
                            this.isNumericCharactersRequired,
                            this.isSpecialCharactersRequired,
                            this.isUsernameContainmentAllowed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PasswordPolicy model) {
            if (model.wasPropertyExplicitlySet("minimumPasswordLength")) {
                this.minimumPasswordLength(model.getMinimumPasswordLength());
            }
            if (model.wasPropertyExplicitlySet("isUppercaseCharactersRequired")) {
                this.isUppercaseCharactersRequired(model.getIsUppercaseCharactersRequired());
            }
            if (model.wasPropertyExplicitlySet("isLowercaseCharactersRequired")) {
                this.isLowercaseCharactersRequired(model.getIsLowercaseCharactersRequired());
            }
            if (model.wasPropertyExplicitlySet("isNumericCharactersRequired")) {
                this.isNumericCharactersRequired(model.getIsNumericCharactersRequired());
            }
            if (model.wasPropertyExplicitlySet("isSpecialCharactersRequired")) {
                this.isSpecialCharactersRequired(model.getIsSpecialCharactersRequired());
            }
            if (model.wasPropertyExplicitlySet("isUsernameContainmentAllowed")) {
                this.isUsernameContainmentAllowed(model.getIsUsernameContainmentAllowed());
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

    /** Minimum password length required. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumPasswordLength")
    private final Integer minimumPasswordLength;

    /**
     * Minimum password length required.
     *
     * @return the value
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    /** At least one uppercase character required. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUppercaseCharactersRequired")
    private final Boolean isUppercaseCharactersRequired;

    /**
     * At least one uppercase character required.
     *
     * @return the value
     */
    public Boolean getIsUppercaseCharactersRequired() {
        return isUppercaseCharactersRequired;
    }

    /** At least one lower case character required. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLowercaseCharactersRequired")
    private final Boolean isLowercaseCharactersRequired;

    /**
     * At least one lower case character required.
     *
     * @return the value
     */
    public Boolean getIsLowercaseCharactersRequired() {
        return isLowercaseCharactersRequired;
    }

    /** At least one numeric character required. */
    @com.fasterxml.jackson.annotation.JsonProperty("isNumericCharactersRequired")
    private final Boolean isNumericCharactersRequired;

    /**
     * At least one numeric character required.
     *
     * @return the value
     */
    public Boolean getIsNumericCharactersRequired() {
        return isNumericCharactersRequired;
    }

    /** At least one special character required. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSpecialCharactersRequired")
    private final Boolean isSpecialCharactersRequired;

    /**
     * At least one special character required.
     *
     * @return the value
     */
    public Boolean getIsSpecialCharactersRequired() {
        return isSpecialCharactersRequired;
    }

    /** User name is allowed to be part of the password. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUsernameContainmentAllowed")
    private final Boolean isUsernameContainmentAllowed;

    /**
     * User name is allowed to be part of the password.
     *
     * @return the value
     */
    public Boolean getIsUsernameContainmentAllowed() {
        return isUsernameContainmentAllowed;
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
        sb.append("PasswordPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("minimumPasswordLength=").append(String.valueOf(this.minimumPasswordLength));
        sb.append(", isUppercaseCharactersRequired=")
                .append(String.valueOf(this.isUppercaseCharactersRequired));
        sb.append(", isLowercaseCharactersRequired=")
                .append(String.valueOf(this.isLowercaseCharactersRequired));
        sb.append(", isNumericCharactersRequired=")
                .append(String.valueOf(this.isNumericCharactersRequired));
        sb.append(", isSpecialCharactersRequired=")
                .append(String.valueOf(this.isSpecialCharactersRequired));
        sb.append(", isUsernameContainmentAllowed=")
                .append(String.valueOf(this.isUsernameContainmentAllowed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PasswordPolicy)) {
            return false;
        }

        PasswordPolicy other = (PasswordPolicy) o;
        return java.util.Objects.equals(this.minimumPasswordLength, other.minimumPasswordLength)
                && java.util.Objects.equals(
                        this.isUppercaseCharactersRequired, other.isUppercaseCharactersRequired)
                && java.util.Objects.equals(
                        this.isLowercaseCharactersRequired, other.isLowercaseCharactersRequired)
                && java.util.Objects.equals(
                        this.isNumericCharactersRequired, other.isNumericCharactersRequired)
                && java.util.Objects.equals(
                        this.isSpecialCharactersRequired, other.isSpecialCharactersRequired)
                && java.util.Objects.equals(
                        this.isUsernameContainmentAllowed, other.isUsernameContainmentAllowed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.minimumPasswordLength == null
                                ? 43
                                : this.minimumPasswordLength.hashCode());
        result =
                (result * PRIME)
                        + (this.isUppercaseCharactersRequired == null
                                ? 43
                                : this.isUppercaseCharactersRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.isLowercaseCharactersRequired == null
                                ? 43
                                : this.isLowercaseCharactersRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.isNumericCharactersRequired == null
                                ? 43
                                : this.isNumericCharactersRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.isSpecialCharactersRequired == null
                                ? 43
                                : this.isSpecialCharactersRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.isUsernameContainmentAllowed == null
                                ? 43
                                : this.isUsernameContainmentAllowed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
