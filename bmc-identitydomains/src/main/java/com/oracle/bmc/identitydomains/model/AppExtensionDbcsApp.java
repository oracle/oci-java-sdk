/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension provides attributes for database service facet of an App
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
    builder = AppExtensionDbcsApp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppExtensionDbcsApp extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"domainName", "domainApp"})
    public AppExtensionDbcsApp(String domainName, AppDomainApp domainApp) {
        super();
        this.domainName = domainName;
        this.domainApp = domainApp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the Enterprise Domain that contains any number of DBInstances. If specified, the value must be unique.  A non-null value indicates that App represents a DBDomain. A value of null indicates that the App represents an DB-instance.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: server
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        /**
         * The name of the Enterprise Domain that contains any number of DBInstances. If specified, the value must be unique.  A non-null value indicates that App represents a DBDomain. A value of null indicates that the App represents an DB-instance.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: server
         * @param domainName the value to set
         * @return this builder
         **/
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainApp")
        private AppDomainApp domainApp;

        public Builder domainApp(AppDomainApp domainApp) {
            this.domainApp = domainApp;
            this.__explicitlySet__.add("domainApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionDbcsApp build() {
            AppExtensionDbcsApp model = new AppExtensionDbcsApp(this.domainName, this.domainApp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionDbcsApp model) {
            if (model.wasPropertyExplicitlySet("domainName")) {
                this.domainName(model.getDomainName());
            }
            if (model.wasPropertyExplicitlySet("domainApp")) {
                this.domainApp(model.getDomainApp());
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
     * The name of the Enterprise Domain that contains any number of DBInstances. If specified, the value must be unique.  A non-null value indicates that App represents a DBDomain. A value of null indicates that the App represents an DB-instance.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

    /**
     * The name of the Enterprise Domain that contains any number of DBInstances. If specified, the value must be unique.  A non-null value indicates that App represents a DBDomain. A value of null indicates that the App represents an DB-instance.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: server
     * @return the value
     **/
    public String getDomainName() {
        return domainName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("domainApp")
    private final AppDomainApp domainApp;

    public AppDomainApp getDomainApp() {
        return domainApp;
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
        sb.append("AppExtensionDbcsApp(");
        sb.append("super=").append(super.toString());
        sb.append("domainName=").append(String.valueOf(this.domainName));
        sb.append(", domainApp=").append(String.valueOf(this.domainApp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionDbcsApp)) {
            return false;
        }

        AppExtensionDbcsApp other = (AppExtensionDbcsApp) o;
        return java.util.Objects.equals(this.domainName, other.domainName)
                && java.util.Objects.equals(this.domainApp, other.domainApp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result = (result * PRIME) + (this.domainApp == null ? 43 : this.domainApp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
