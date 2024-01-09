/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of application-formURLs that FormFill should match against any formUrl that the
 * user-specifies when signing in to the target service. Each item in the list also indicates how
 * FormFill should interpret that formUrl.
 *
 * <p>*SCIM++ Properties:** - idcsCompositeKey: [formUrl] - multiValued: true - mutability:
 * readWrite - required: false - returned: default - type: complex - uniqueness: none <br>
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
        builder = AppFormFillUrlMatch.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppFormFillUrlMatch
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"formUrlMatchType", "formUrl"})
    public AppFormFillUrlMatch(String formUrlMatchType, String formUrl) {
        super();
        this.formUrlMatchType = formUrlMatchType;
        this.formUrl = formUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates how to interpret the value of 'formUrl' when matching against a user-specified
         * formUrl. The system currently supports only 'Exact', which indicates that the value of
         * 'formUrl' should be treated as a literal value.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formUrlMatchType")
        private String formUrlMatchType;

        /**
         * Indicates how to interpret the value of 'formUrl' when matching against a user-specified
         * formUrl. The system currently supports only 'Exact', which indicates that the value of
         * 'formUrl' should be treated as a literal value.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param formUrlMatchType the value to set
         * @return this builder
         */
        public Builder formUrlMatchType(String formUrlMatchType) {
            this.formUrlMatchType = formUrlMatchType;
            this.__explicitlySet__.add("formUrlMatchType");
            return this;
        }
        /**
         * An application formUrl that FormFill will match against any formUrl that a User enters in
         * trying to access the target-service which this App represents.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formUrl")
        private String formUrl;

        /**
         * An application formUrl that FormFill will match against any formUrl that a User enters in
         * trying to access the target-service which this App represents.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param formUrl the value to set
         * @return this builder
         */
        public Builder formUrl(String formUrl) {
            this.formUrl = formUrl;
            this.__explicitlySet__.add("formUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppFormFillUrlMatch build() {
            AppFormFillUrlMatch model =
                    new AppFormFillUrlMatch(this.formUrlMatchType, this.formUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppFormFillUrlMatch model) {
            if (model.wasPropertyExplicitlySet("formUrlMatchType")) {
                this.formUrlMatchType(model.getFormUrlMatchType());
            }
            if (model.wasPropertyExplicitlySet("formUrl")) {
                this.formUrl(model.getFormUrl());
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
     * Indicates how to interpret the value of 'formUrl' when matching against a user-specified
     * formUrl. The system currently supports only 'Exact', which indicates that the value of
     * 'formUrl' should be treated as a literal value.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formUrlMatchType")
    private final String formUrlMatchType;

    /**
     * Indicates how to interpret the value of 'formUrl' when matching against a user-specified
     * formUrl. The system currently supports only 'Exact', which indicates that the value of
     * 'formUrl' should be treated as a literal value.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFormUrlMatchType() {
        return formUrlMatchType;
    }

    /**
     * An application formUrl that FormFill will match against any formUrl that a User enters in
     * trying to access the target-service which this App represents.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formUrl")
    private final String formUrl;

    /**
     * An application formUrl that FormFill will match against any formUrl that a User enters in
     * trying to access the target-service which this App represents.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFormUrl() {
        return formUrl;
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
        sb.append("AppFormFillUrlMatch(");
        sb.append("super=").append(super.toString());
        sb.append("formUrlMatchType=").append(String.valueOf(this.formUrlMatchType));
        sb.append(", formUrl=").append(String.valueOf(this.formUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppFormFillUrlMatch)) {
            return false;
        }

        AppFormFillUrlMatch other = (AppFormFillUrlMatch) o;
        return java.util.Objects.equals(this.formUrlMatchType, other.formUrlMatchType)
                && java.util.Objects.equals(this.formUrl, other.formUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.formUrlMatchType == null ? 43 : this.formUrlMatchType.hashCode());
        result = (result * PRIME) + (this.formUrl == null ? 43 : this.formUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
