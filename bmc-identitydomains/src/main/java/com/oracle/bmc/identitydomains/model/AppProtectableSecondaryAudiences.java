/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of secondary audiences--additional URIs to be added automatically to any OAuth token that
 * allows access to this App. Note: This attribute is used mainly for backward compatibility in
 * certain Oracle Public Cloud Apps. <br>
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
        builder = AppProtectableSecondaryAudiences.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppProtectableSecondaryAudiences
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "readOnly"})
    public AppProtectableSecondaryAudiences(String value, Boolean readOnly) {
        super();
        this.value = value;
        this.readOnly = readOnly;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The value of an secondary audience--additional URI to be added automatically to any OAuth
         * token that allows access to this App.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of an secondary audience--additional URI to be added automatically to any OAuth
         * token that allows access to this App.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
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
         * If true, indicates that this value must be protected.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
        private Boolean readOnly;

        /**
         * If true, indicates that this value must be protected.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: boolean - uniqueness: none
         *
         * @param readOnly the value to set
         * @return this builder
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            this.__explicitlySet__.add("readOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppProtectableSecondaryAudiences build() {
            AppProtectableSecondaryAudiences model =
                    new AppProtectableSecondaryAudiences(this.value, this.readOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppProtectableSecondaryAudiences model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("readOnly")) {
                this.readOnly(model.getReadOnly());
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
     * The value of an secondary audience--additional URI to be added automatically to any OAuth
     * token that allows access to this App.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of an secondary audience--additional URI to be added automatically to any OAuth
     * token that allows access to this App.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * If true, indicates that this value must be protected.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    private final Boolean readOnly;

    /**
     * If true, indicates that this value must be protected.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getReadOnly() {
        return readOnly;
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
        sb.append("AppProtectableSecondaryAudiences(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", readOnly=").append(String.valueOf(this.readOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppProtectableSecondaryAudiences)) {
            return false;
        }

        AppProtectableSecondaryAudiences other = (AppProtectableSecondaryAudiences) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.readOnly, other.readOnly)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.readOnly == null ? 43 : this.readOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
