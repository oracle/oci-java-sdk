/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of devices enrolled by the user.
 * <p>
 **Added In:** 18.3.6
 * <p>
 **SCIM++ Properties:**
 *  - idcsCompositeKey: [value]
 *  - multiValued: true
 *  - mutability: readOnly
 *  - required: false
 *  - returned: request
 *  - type: complex
 *  - uniqueness: none
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserExtDevices.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserExtDevices extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "ref",
        "display",
        "status",
        "lastSyncTime",
        "factorType",
        "factorStatus",
        "authenticationMethod",
        "thirdPartyVendorName"
    })
    public UserExtDevices(
            String value,
            String ref,
            String display,
            String status,
            String lastSyncTime,
            String factorType,
            String factorStatus,
            String authenticationMethod,
            String thirdPartyVendorName) {
        super();
        this.value = value;
        this.ref = ref;
        this.display = display;
        this.status = status;
        this.lastSyncTime = lastSyncTime;
        this.factorType = factorType;
        this.factorStatus = factorStatus;
        this.authenticationMethod = authenticationMethod;
        this.thirdPartyVendorName = thirdPartyVendorName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the User's device.
         * <p>
         **Added In:** 18.3.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The identifier of the User's device.
         * <p>
         **Added In:** 18.3.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The URI of the corresponding Device resource which belongs to user
         * <p>
         **Added In:** 18.3.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI of the corresponding Device resource which belongs to user
         * <p>
         **Added In:** 18.3.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         * @param ref the value to set
         * @return this builder
         **/
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * A human readable name, primarily used for display purposes. READ-ONLY.
         * <p>
         **Added In:** 18.3.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * A human readable name, primarily used for display purposes. READ-ONLY.
         * <p>
         **Added In:** 18.3.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param display the value to set
         * @return this builder
         **/
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * Device status.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Device status.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Last Sync time for device.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastSyncTime")
        private String lastSyncTime;

        /**
         * Last Sync time for device.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         * @param lastSyncTime the value to set
         * @return this builder
         **/
        public Builder lastSyncTime(String lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            this.__explicitlySet__.add("lastSyncTime");
            return this;
        }
        /**
         * Device authentication factor type.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("factorType")
        private String factorType;

        /**
         * Device authentication factor type.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param factorType the value to set
         * @return this builder
         **/
        public Builder factorType(String factorType) {
            this.factorType = factorType;
            this.__explicitlySet__.add("factorType");
            return this;
        }
        /**
         * Device authentication factor status.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("factorStatus")
        private String factorStatus;

        /**
         * Device authentication factor status.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param factorStatus the value to set
         * @return this builder
         **/
        public Builder factorStatus(String factorStatus) {
            this.factorStatus = factorStatus;
            this.__explicitlySet__.add("factorStatus");
            return this;
        }
        /**
         * Authentication method.
         * <p>
         **Added In:** 2009232244
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationMethod")
        private String authenticationMethod;

        /**
         * Authentication method.
         * <p>
         **Added In:** 2009232244
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param authenticationMethod the value to set
         * @return this builder
         **/
        public Builder authenticationMethod(String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            this.__explicitlySet__.add("authenticationMethod");
            return this;
        }
        /**
         * Third party factor vendor name.
         * <p>
         **Added In:** 2009232244
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyVendorName")
        private String thirdPartyVendorName;

        /**
         * Third party factor vendor name.
         * <p>
         **Added In:** 2009232244
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param thirdPartyVendorName the value to set
         * @return this builder
         **/
        public Builder thirdPartyVendorName(String thirdPartyVendorName) {
            this.thirdPartyVendorName = thirdPartyVendorName;
            this.__explicitlySet__.add("thirdPartyVendorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtDevices build() {
            UserExtDevices model =
                    new UserExtDevices(
                            this.value,
                            this.ref,
                            this.display,
                            this.status,
                            this.lastSyncTime,
                            this.factorType,
                            this.factorStatus,
                            this.authenticationMethod,
                            this.thirdPartyVendorName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtDevices model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lastSyncTime")) {
                this.lastSyncTime(model.getLastSyncTime());
            }
            if (model.wasPropertyExplicitlySet("factorType")) {
                this.factorType(model.getFactorType());
            }
            if (model.wasPropertyExplicitlySet("factorStatus")) {
                this.factorStatus(model.getFactorStatus());
            }
            if (model.wasPropertyExplicitlySet("authenticationMethod")) {
                this.authenticationMethod(model.getAuthenticationMethod());
            }
            if (model.wasPropertyExplicitlySet("thirdPartyVendorName")) {
                this.thirdPartyVendorName(model.getThirdPartyVendorName());
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
     * The identifier of the User's device.
     * <p>
     **Added In:** 18.3.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The identifier of the User's device.
     * <p>
     **Added In:** 18.3.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The URI of the corresponding Device resource which belongs to user
     * <p>
     **Added In:** 18.3.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI of the corresponding Device resource which belongs to user
     * <p>
     **Added In:** 18.3.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     * @return the value
     **/
    public String getRef() {
        return ref;
    }

    /**
     * A human readable name, primarily used for display purposes. READ-ONLY.
     * <p>
     **Added In:** 18.3.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * A human readable name, primarily used for display purposes. READ-ONLY.
     * <p>
     **Added In:** 18.3.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDisplay() {
        return display;
    }

    /**
     * Device status.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Device status.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * Last Sync time for device.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastSyncTime")
    private final String lastSyncTime;

    /**
     * Last Sync time for device.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Device authentication factor type.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("factorType")
    private final String factorType;

    /**
     * Device authentication factor type.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getFactorType() {
        return factorType;
    }

    /**
     * Device authentication factor status.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("factorStatus")
    private final String factorStatus;

    /**
     * Device authentication factor status.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getFactorStatus() {
        return factorStatus;
    }

    /**
     * Authentication method.
     * <p>
     **Added In:** 2009232244
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationMethod")
    private final String authenticationMethod;

    /**
     * Authentication method.
     * <p>
     **Added In:** 2009232244
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Third party factor vendor name.
     * <p>
     **Added In:** 2009232244
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyVendorName")
    private final String thirdPartyVendorName;

    /**
     * Third party factor vendor name.
     * <p>
     **Added In:** 2009232244
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getThirdPartyVendorName() {
        return thirdPartyVendorName;
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
        sb.append("UserExtDevices(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lastSyncTime=").append(String.valueOf(this.lastSyncTime));
        sb.append(", factorType=").append(String.valueOf(this.factorType));
        sb.append(", factorStatus=").append(String.valueOf(this.factorStatus));
        sb.append(", authenticationMethod=").append(String.valueOf(this.authenticationMethod));
        sb.append(", thirdPartyVendorName=").append(String.valueOf(this.thirdPartyVendorName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtDevices)) {
            return false;
        }

        UserExtDevices other = (UserExtDevices) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lastSyncTime, other.lastSyncTime)
                && java.util.Objects.equals(this.factorType, other.factorType)
                && java.util.Objects.equals(this.factorStatus, other.factorStatus)
                && java.util.Objects.equals(this.authenticationMethod, other.authenticationMethod)
                && java.util.Objects.equals(this.thirdPartyVendorName, other.thirdPartyVendorName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.lastSyncTime == null ? 43 : this.lastSyncTime.hashCode());
        result = (result * PRIME) + (this.factorType == null ? 43 : this.factorType.hashCode());
        result = (result * PRIME) + (this.factorStatus == null ? 43 : this.factorStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationMethod == null
                                ? 43
                                : this.authenticationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.thirdPartyVendorName == null
                                ? 43
                                : this.thirdPartyVendorName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
