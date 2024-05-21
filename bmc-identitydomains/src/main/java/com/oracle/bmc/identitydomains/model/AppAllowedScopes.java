/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of scopes (exposed by this App or by other Apps) that this App is allowed to access when it acts as an OAuthClient.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AppAllowedScopes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppAllowedScopes extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fqs", "idOfDefiningApp", "readOnly"})
    public AppAllowedScopes(String fqs, String idOfDefiningApp, Boolean readOnly) {
        super();
        this.fqs = fqs;
        this.idOfDefiningApp = idOfDefiningApp;
        this.readOnly = readOnly;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A fully qualified scope that this App is allowed to access when it acts as an OAuthClient.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fqs")
        private String fqs;

        /**
         * A fully qualified scope that this App is allowed to access when it acts as an OAuthClient.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param fqs the value to set
         * @return this builder
         **/
        public Builder fqs(String fqs) {
            this.fqs = fqs;
            this.__explicitlySet__.add("fqs");
            return this;
        }
        /**
         * The ID of the App that defines this scope.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idOfDefiningApp")
        private String idOfDefiningApp;

        /**
         * The ID of the App that defines this scope.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idOfDefiningApp the value to set
         * @return this builder
         **/
        public Builder idOfDefiningApp(String idOfDefiningApp) {
            this.idOfDefiningApp = idOfDefiningApp;
            this.__explicitlySet__.add("idOfDefiningApp");
            return this;
        }
        /**
         * If true, indicates that this value must be protected.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
        private Boolean readOnly;

        /**
         * If true, indicates that this value must be protected.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param readOnly the value to set
         * @return this builder
         **/
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            this.__explicitlySet__.add("readOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppAllowedScopes build() {
            AppAllowedScopes model =
                    new AppAllowedScopes(this.fqs, this.idOfDefiningApp, this.readOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppAllowedScopes model) {
            if (model.wasPropertyExplicitlySet("fqs")) {
                this.fqs(model.getFqs());
            }
            if (model.wasPropertyExplicitlySet("idOfDefiningApp")) {
                this.idOfDefiningApp(model.getIdOfDefiningApp());
            }
            if (model.wasPropertyExplicitlySet("readOnly")) {
                this.readOnly(model.getReadOnly());
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
     * A fully qualified scope that this App is allowed to access when it acts as an OAuthClient.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fqs")
    private final String fqs;

    /**
     * A fully qualified scope that this App is allowed to access when it acts as an OAuthClient.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getFqs() {
        return fqs;
    }

    /**
     * The ID of the App that defines this scope.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idOfDefiningApp")
    private final String idOfDefiningApp;

    /**
     * The ID of the App that defines this scope.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdOfDefiningApp() {
        return idOfDefiningApp;
    }

    /**
     * If true, indicates that this value must be protected.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    private final Boolean readOnly;

    /**
     * If true, indicates that this value must be protected.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getReadOnly() {
        return readOnly;
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
        sb.append("AppAllowedScopes(");
        sb.append("super=").append(super.toString());
        sb.append("fqs=").append(String.valueOf(this.fqs));
        sb.append(", idOfDefiningApp=").append(String.valueOf(this.idOfDefiningApp));
        sb.append(", readOnly=").append(String.valueOf(this.readOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppAllowedScopes)) {
            return false;
        }

        AppAllowedScopes other = (AppAllowedScopes) o;
        return java.util.Objects.equals(this.fqs, other.fqs)
                && java.util.Objects.equals(this.idOfDefiningApp, other.idOfDefiningApp)
                && java.util.Objects.equals(this.readOnly, other.readOnly)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fqs == null ? 43 : this.fqs.hashCode());
        result =
                (result * PRIME)
                        + (this.idOfDefiningApp == null ? 43 : this.idOfDefiningApp.hashCode());
        result = (result * PRIME) + (this.readOnly == null ? 43 : this.readOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
