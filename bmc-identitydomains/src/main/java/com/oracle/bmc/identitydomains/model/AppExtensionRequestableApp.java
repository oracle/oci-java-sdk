/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Requestable App <br>
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
        builder = AppExtensionRequestableApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionRequestableApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"requestable"})
    public AppExtensionRequestableApp(Boolean requestable) {
        super();
        this.requestable = requestable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Flag controlling whether resource can be request by user through self service console.
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: request - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestable")
        private Boolean requestable;

        /**
         * Flag controlling whether resource can be request by user through self service console.
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: request - type: boolean - uniqueness:
         * none
         *
         * @param requestable the value to set
         * @return this builder
         */
        public Builder requestable(Boolean requestable) {
            this.requestable = requestable;
            this.__explicitlySet__.add("requestable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionRequestableApp build() {
            AppExtensionRequestableApp model = new AppExtensionRequestableApp(this.requestable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionRequestableApp model) {
            if (model.wasPropertyExplicitlySet("requestable")) {
                this.requestable(model.getRequestable());
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
     * Flag controlling whether resource can be request by user through self service console.
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: request - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestable")
    private final Boolean requestable;

    /**
     * Flag controlling whether resource can be request by user through self service console.
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: request - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getRequestable() {
        return requestable;
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
        sb.append("AppExtensionRequestableApp(");
        sb.append("super=").append(super.toString());
        sb.append("requestable=").append(String.valueOf(this.requestable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionRequestableApp)) {
            return false;
        }

        AppExtensionRequestableApp other = (AppExtensionRequestableApp) o;
        return java.util.Objects.equals(this.requestable, other.requestable) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.requestable == null ? 43 : this.requestable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
