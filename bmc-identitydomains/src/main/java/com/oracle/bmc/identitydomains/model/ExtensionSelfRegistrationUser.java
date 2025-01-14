/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to manage self registration profile linked to the user.
 * <br>
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
        builder = ExtensionSelfRegistrationUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionSelfRegistrationUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"consentGranted", "userToken", "selfRegistrationProfile"})
    public ExtensionSelfRegistrationUser(
            Boolean consentGranted,
            String userToken,
            UserExtSelfRegistrationProfile selfRegistrationProfile) {
        super();
        this.consentGranted = consentGranted;
        this.userToken = userToken;
        this.selfRegistrationProfile = selfRegistrationProfile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A boolean value that indicates whether the consent is granted.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("consentGranted")
        private Boolean consentGranted;

        /**
         * A boolean value that indicates whether the consent is granted.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param consentGranted the value to set
         * @return this builder
         */
        public Builder consentGranted(Boolean consentGranted) {
            this.consentGranted = consentGranted;
            this.__explicitlySet__.add("consentGranted");
            return this;
        }
        /**
         * User token used for auto-login.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userToken")
        private String userToken;

        /**
         * User token used for auto-login.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param userToken the value to set
         * @return this builder
         */
        public Builder userToken(String userToken) {
            this.userToken = userToken;
            this.__explicitlySet__.add("userToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("selfRegistrationProfile")
        private UserExtSelfRegistrationProfile selfRegistrationProfile;

        public Builder selfRegistrationProfile(
                UserExtSelfRegistrationProfile selfRegistrationProfile) {
            this.selfRegistrationProfile = selfRegistrationProfile;
            this.__explicitlySet__.add("selfRegistrationProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionSelfRegistrationUser build() {
            ExtensionSelfRegistrationUser model =
                    new ExtensionSelfRegistrationUser(
                            this.consentGranted, this.userToken, this.selfRegistrationProfile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionSelfRegistrationUser model) {
            if (model.wasPropertyExplicitlySet("consentGranted")) {
                this.consentGranted(model.getConsentGranted());
            }
            if (model.wasPropertyExplicitlySet("userToken")) {
                this.userToken(model.getUserToken());
            }
            if (model.wasPropertyExplicitlySet("selfRegistrationProfile")) {
                this.selfRegistrationProfile(model.getSelfRegistrationProfile());
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
     * A boolean value that indicates whether the consent is granted.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consentGranted")
    private final Boolean consentGranted;

    /**
     * A boolean value that indicates whether the consent is granted.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getConsentGranted() {
        return consentGranted;
    }

    /**
     * User token used for auto-login.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userToken")
    private final String userToken;

    /**
     * User token used for auto-login.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getUserToken() {
        return userToken;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("selfRegistrationProfile")
    private final UserExtSelfRegistrationProfile selfRegistrationProfile;

    public UserExtSelfRegistrationProfile getSelfRegistrationProfile() {
        return selfRegistrationProfile;
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
        sb.append("ExtensionSelfRegistrationUser(");
        sb.append("super=").append(super.toString());
        sb.append("consentGranted=").append(String.valueOf(this.consentGranted));
        sb.append(", userToken=").append(String.valueOf(this.userToken));
        sb.append(", selfRegistrationProfile=")
                .append(String.valueOf(this.selfRegistrationProfile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionSelfRegistrationUser)) {
            return false;
        }

        ExtensionSelfRegistrationUser other = (ExtensionSelfRegistrationUser) o;
        return java.util.Objects.equals(this.consentGranted, other.consentGranted)
                && java.util.Objects.equals(this.userToken, other.userToken)
                && java.util.Objects.equals(
                        this.selfRegistrationProfile, other.selfRegistrationProfile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.consentGranted == null ? 43 : this.consentGranted.hashCode());
        result = (result * PRIME) + (this.userToken == null ? 43 : this.userToken.hashCode());
        result =
                (result * PRIME)
                        + (this.selfRegistrationProfile == null
                                ? 43
                                : this.selfRegistrationProfile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
