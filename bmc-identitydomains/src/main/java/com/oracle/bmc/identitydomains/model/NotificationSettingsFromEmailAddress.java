/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * From email address to be used in the notification emails
 *
 * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
 * required: true - returned: always - type: complex - uniqueness: none <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NotificationSettingsFromEmailAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NotificationSettingsFromEmailAddress
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "validationStatus", "validate", "displayName"})
    public NotificationSettingsFromEmailAddress(
            String value,
            ValidationStatus validationStatus,
            Validate validate,
            String displayName) {
        super();
        this.value = value;
        this.validationStatus = validationStatus;
        this.validate = validate;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Value of the From email address
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of the From email address
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Validation status for the From email address
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
        private ValidationStatus validationStatus;

        /**
         * Validation status for the From email address
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: string
         *
         * @param validationStatus the value to set
         * @return this builder
         */
        public Builder validationStatus(ValidationStatus validationStatus) {
            this.validationStatus = validationStatus;
            this.__explicitlySet__.add("validationStatus");
            return this;
        }
        /**
         * From address verification mode. If postmaster account is available then 'domain' mode is
         * used or entire valid email can be verified using 'email' mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("validate")
        private Validate validate;

        /**
         * From address verification mode. If postmaster account is available then 'domain' mode is
         * used or entire valid email can be verified using 'email' mode
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param validate the value to set
         * @return this builder
         */
        public Builder validate(Validate validate) {
            this.validate = validate;
            this.__explicitlySet__.add("validate");
            return this;
        }
        /**
         * Display name for the From email address
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the From email address
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotificationSettingsFromEmailAddress build() {
            NotificationSettingsFromEmailAddress model =
                    new NotificationSettingsFromEmailAddress(
                            this.value, this.validationStatus, this.validate, this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotificationSettingsFromEmailAddress model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("validationStatus")) {
                this.validationStatus(model.getValidationStatus());
            }
            if (model.wasPropertyExplicitlySet("validate")) {
                this.validate(model.getValidate());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
     * Value of the From email address
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of the From email address
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Validation status for the From email address
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: string
     */
    public enum ValidationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Verified("VERIFIED"),
        Pending("PENDING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ValidationStatus.class);

        private final String value;
        private static java.util.Map<String, ValidationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidationStatus v : ValidationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValidationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValidationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValidationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Validation status for the From email address
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
    private final ValidationStatus validationStatus;

    /**
     * Validation status for the From email address
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: string
     *
     * @return the value
     */
    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /**
     * From address verification mode. If postmaster account is available then 'domain' mode is used
     * or entire valid email can be verified using 'email' mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    public enum Validate implements com.oracle.bmc.http.internal.BmcEnum {
        Email("email"),
        Domain("domain"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Validate.class);

        private final String value;
        private static java.util.Map<String, Validate> map;

        static {
            map = new java.util.HashMap<>();
            for (Validate v : Validate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Validate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Validate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Validate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * From address verification mode. If postmaster account is available then 'domain' mode is used
     * or entire valid email can be verified using 'email' mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validate")
    private final Validate validate;

    /**
     * From address verification mode. If postmaster account is available then 'domain' mode is used
     * or entire valid email can be verified using 'email' mode
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Validate getValidate() {
        return validate;
    }

    /**
     * Display name for the From email address
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the From email address
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("NotificationSettingsFromEmailAddress(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", validationStatus=").append(String.valueOf(this.validationStatus));
        sb.append(", validate=").append(String.valueOf(this.validate));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationSettingsFromEmailAddress)) {
            return false;
        }

        NotificationSettingsFromEmailAddress other = (NotificationSettingsFromEmailAddress) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.validationStatus, other.validationStatus)
                && java.util.Objects.equals(this.validate, other.validate)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.validationStatus == null ? 43 : this.validationStatus.hashCode());
        result = (result * PRIME) + (this.validate == null ? 43 : this.validate.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
