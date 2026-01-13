/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to record consent for modification of the "Security Policy
 * for OCI Console" sign-on policy, Rule, Condition or ConditionGroup. <br>
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
        builder = RuleExtensionOciconsolesignonpolicyconsentPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RuleExtensionOciconsolesignonpolicyconsentPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"consent", "justification", "reason"})
    public RuleExtensionOciconsolesignonpolicyconsentPolicy(
            Boolean consent, String justification, String reason) {
        super();
        this.consent = consent;
        this.justification = justification;
        this.reason = reason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Set to true when an identity domain administrator opts to change the Oracle security
         * defaults for the "Security Policy for OCI Console" shipped by Oracle. Defaults to false.
         *
         * <p>*Added In:** 2405220110
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("consent")
        private Boolean consent;

        /**
         * Set to true when an identity domain administrator opts to change the Oracle security
         * defaults for the "Security Policy for OCI Console" shipped by Oracle. Defaults to false.
         *
         * <p>*Added In:** 2405220110
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: boolean
         *
         * @param consent the value to set
         * @return this builder
         */
        public Builder consent(Boolean consent) {
            this.consent = consent;
            this.__explicitlySet__.add("consent");
            return this;
        }
        /**
         * The justification for the change when an identity domain administrator opts to modify the
         * Oracle security defaults for the "Security Policy for OCI Console" sign-on policy shipped
         * by Oracle.
         *
         * <p>*Added In:** 2405220110
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("justification")
        private String justification;

        /**
         * The justification for the change when an identity domain administrator opts to modify the
         * Oracle security defaults for the "Security Policy for OCI Console" sign-on policy shipped
         * by Oracle.
         *
         * <p>*Added In:** 2405220110
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: string
         *
         * @param justification the value to set
         * @return this builder
         */
        public Builder justification(String justification) {
            this.justification = justification;
            this.__explicitlySet__.add("justification");
            return this;
        }
        /**
         * The detailed reason for the change when an identity domain administrator opts to modify
         * the Oracle security defaults for the "Security Policy for OCI Console" sign-on policy
         * shipped by Oracle.
         *
         * <p>*Added In:** 2405220110
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        /**
         * The detailed reason for the change when an identity domain administrator opts to modify
         * the Oracle security defaults for the "Security Policy for OCI Console" sign-on policy
         * shipped by Oracle.
         *
         * <p>*Added In:** 2405220110
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: string
         *
         * @param reason the value to set
         * @return this builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleExtensionOciconsolesignonpolicyconsentPolicy build() {
            RuleExtensionOciconsolesignonpolicyconsentPolicy model =
                    new RuleExtensionOciconsolesignonpolicyconsentPolicy(
                            this.consent, this.justification, this.reason);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleExtensionOciconsolesignonpolicyconsentPolicy model) {
            if (model.wasPropertyExplicitlySet("consent")) {
                this.consent(model.getConsent());
            }
            if (model.wasPropertyExplicitlySet("justification")) {
                this.justification(model.getJustification());
            }
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
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
     * Set to true when an identity domain administrator opts to change the Oracle security defaults
     * for the "Security Policy for OCI Console" shipped by Oracle. Defaults to false.
     *
     * <p>*Added In:** 2405220110
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consent")
    private final Boolean consent;

    /**
     * Set to true when an identity domain administrator opts to change the Oracle security defaults
     * for the "Security Policy for OCI Console" shipped by Oracle. Defaults to false.
     *
     * <p>*Added In:** 2405220110
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: boolean
     *
     * @return the value
     */
    public Boolean getConsent() {
        return consent;
    }

    /**
     * The justification for the change when an identity domain administrator opts to modify the
     * Oracle security defaults for the "Security Policy for OCI Console" sign-on policy shipped by
     * Oracle.
     *
     * <p>*Added In:** 2405220110
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("justification")
    private final String justification;

    /**
     * The justification for the change when an identity domain administrator opts to modify the
     * Oracle security defaults for the "Security Policy for OCI Console" sign-on policy shipped by
     * Oracle.
     *
     * <p>*Added In:** 2405220110
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: string
     *
     * @return the value
     */
    public String getJustification() {
        return justification;
    }

    /**
     * The detailed reason for the change when an identity domain administrator opts to modify the
     * Oracle security defaults for the "Security Policy for OCI Console" sign-on policy shipped by
     * Oracle.
     *
     * <p>*Added In:** 2405220110
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final String reason;

    /**
     * The detailed reason for the change when an identity domain administrator opts to modify the
     * Oracle security defaults for the "Security Policy for OCI Console" sign-on policy shipped by
     * Oracle.
     *
     * <p>*Added In:** 2405220110
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: string
     *
     * @return the value
     */
    public String getReason() {
        return reason;
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
        sb.append("RuleExtensionOciconsolesignonpolicyconsentPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("consent=").append(String.valueOf(this.consent));
        sb.append(", justification=").append(String.valueOf(this.justification));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuleExtensionOciconsolesignonpolicyconsentPolicy)) {
            return false;
        }

        RuleExtensionOciconsolesignonpolicyconsentPolicy other =
                (RuleExtensionOciconsolesignonpolicyconsentPolicy) o;
        return java.util.Objects.equals(this.consent, other.consent)
                && java.util.Objects.equals(this.justification, other.justification)
                && java.util.Objects.equals(this.reason, other.reason)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.consent == null ? 43 : this.consent.hashCode());
        result =
                (result * PRIME)
                        + (this.justification == null ? 43 : this.justification.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
