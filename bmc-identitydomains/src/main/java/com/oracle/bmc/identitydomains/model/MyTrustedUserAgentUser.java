/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * user for whom the trust-token was issued
 * <p>
 **SCIM++ Properties:**
 *  - caseExact: false
 *  - idcsSearchable: true
 *  - multiValued: false
 *  - mutability: readWrite
 *  - required: true
 *  - returned: default
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MyTrustedUserAgentUser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MyTrustedUserAgentUser
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "display", "ocid"})
    public MyTrustedUserAgentUser(String value, String ref, String display, String ocid) {
        super();
        this.value = value;
        this.ref = ref;
        this.display = display;
        this.ocid = ocid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The SCIM ID of the user for whom the trust-token was issued.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The SCIM ID of the user for whom the trust-token was issued.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
         *  - returned: default
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
         * Full URI to the user for whom the trust-token was issued.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * Full URI to the user for whom the trust-token was issued.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
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
         * Friendly name of the User to be used for purposes of display.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
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
         * Friendly name of the User to be used for purposes of display.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
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
         * The OCID of the user
         * <p>
         **Added In:** 2105091740
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * The OCID of the user
         * <p>
         **Added In:** 2105091740
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param ocid the value to set
         * @return this builder
         **/
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            this.__explicitlySet__.add("ocid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyTrustedUserAgentUser build() {
            MyTrustedUserAgentUser model =
                    new MyTrustedUserAgentUser(this.value, this.ref, this.display, this.ocid);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyTrustedUserAgentUser model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("ocid")) {
                this.ocid(model.getOcid());
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
     * The SCIM ID of the user for whom the trust-token was issued.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The SCIM ID of the user for whom the trust-token was issued.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Full URI to the user for whom the trust-token was issued.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * Full URI to the user for whom the trust-token was issued.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     * @return the value
     **/
    public String getRef() {
        return ref;
    }

    /**
     * Friendly name of the User to be used for purposes of display.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
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
     * Friendly name of the User to be used for purposes of display.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
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
     * The OCID of the user
     * <p>
     **Added In:** 2105091740
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * The OCID of the user
     * <p>
     **Added In:** 2105091740
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getOcid() {
        return ocid;
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
        sb.append("MyTrustedUserAgentUser(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", ocid=").append(String.valueOf(this.ocid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyTrustedUserAgentUser)) {
            return false;
        }

        MyTrustedUserAgentUser other = (MyTrustedUserAgentUser) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
