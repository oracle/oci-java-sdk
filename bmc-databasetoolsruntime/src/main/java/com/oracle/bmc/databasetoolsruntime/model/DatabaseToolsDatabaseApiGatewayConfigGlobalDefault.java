/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The content of a Database Tools database API gateway config global resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseToolsDatabaseApiGatewayConfigGlobalDefault.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseToolsDatabaseApiGatewayConfigGlobalDefault
        extends DatabaseToolsDatabaseApiGatewayConfigGlobal {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("poolRoute")
        private PoolRoute poolRoute;

        public Builder poolRoute(PoolRoute poolRoute) {
            this.poolRoute = poolRoute;
            this.__explicitlySet__.add("poolRoute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("poolRoutingHeader")
        private String poolRoutingHeader;

        public Builder poolRoutingHeader(String poolRoutingHeader) {
            this.poolRoutingHeader = poolRoutingHeader;
            this.__explicitlySet__.add("poolRoutingHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseApiStatus")
        private DatabaseApiStatus databaseApiStatus;

        public Builder databaseApiStatus(DatabaseApiStatus databaseApiStatus) {
            this.databaseApiStatus = databaseApiStatus;
            this.__explicitlySet__.add("databaseApiStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataSource")
        private MetadataSource metadataSource;

        public Builder metadataSource(MetadataSource metadataSource) {
            this.metadataSource = metadataSource;
            this.__explicitlySet__.add("metadataSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpPort")
        private Integer httpPort;

        public Builder httpPort(Integer httpPort) {
            this.httpPort = httpPort;
            this.__explicitlySet__.add("httpPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpsPort")
        private Integer httpsPort;

        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = httpsPort;
            this.__explicitlySet__.add("httpsPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateBundle")
        private DatabaseApiGatewayConfigCertificateBundle certificateBundle;

        public Builder certificateBundle(
                DatabaseApiGatewayConfigCertificateBundle certificateBundle) {
            this.certificateBundle = certificateBundle;
            this.__explicitlySet__.add("certificateBundle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("documentRoot")
        private String documentRoot;

        public Builder documentRoot(String documentRoot) {
            this.documentRoot = documentRoot;
            this.__explicitlySet__.add("documentRoot");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
        private java.util.Map<String, String> advancedProperties;

        public Builder advancedProperties(java.util.Map<String, String> advancedProperties) {
            this.advancedProperties = advancedProperties;
            this.__explicitlySet__.add("advancedProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsDatabaseApiGatewayConfigGlobalDefault build() {
            DatabaseToolsDatabaseApiGatewayConfigGlobalDefault model =
                    new DatabaseToolsDatabaseApiGatewayConfigGlobalDefault(
                            this.key,
                            this.poolRoute,
                            this.poolRoutingHeader,
                            this.databaseApiStatus,
                            this.metadataSource,
                            this.httpPort,
                            this.httpsPort,
                            this.certificateBundle,
                            this.documentRoot,
                            this.advancedProperties,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsDatabaseApiGatewayConfigGlobalDefault model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("poolRoute")) {
                this.poolRoute(model.getPoolRoute());
            }
            if (model.wasPropertyExplicitlySet("poolRoutingHeader")) {
                this.poolRoutingHeader(model.getPoolRoutingHeader());
            }
            if (model.wasPropertyExplicitlySet("databaseApiStatus")) {
                this.databaseApiStatus(model.getDatabaseApiStatus());
            }
            if (model.wasPropertyExplicitlySet("metadataSource")) {
                this.metadataSource(model.getMetadataSource());
            }
            if (model.wasPropertyExplicitlySet("httpPort")) {
                this.httpPort(model.getHttpPort());
            }
            if (model.wasPropertyExplicitlySet("httpsPort")) {
                this.httpsPort(model.getHttpsPort());
            }
            if (model.wasPropertyExplicitlySet("certificateBundle")) {
                this.certificateBundle(model.getCertificateBundle());
            }
            if (model.wasPropertyExplicitlySet("documentRoot")) {
                this.documentRoot(model.getDocumentRoot());
            }
            if (model.wasPropertyExplicitlySet("advancedProperties")) {
                this.advancedProperties(model.getAdvancedProperties());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    @Deprecated
    public DatabaseToolsDatabaseApiGatewayConfigGlobalDefault(
            String key,
            PoolRoute poolRoute,
            String poolRoutingHeader,
            DatabaseApiStatus databaseApiStatus,
            MetadataSource metadataSource,
            Integer httpPort,
            Integer httpsPort,
            DatabaseApiGatewayConfigCertificateBundle certificateBundle,
            String documentRoot,
            java.util.Map<String, String> advancedProperties,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super(
                key,
                poolRoute,
                poolRoutingHeader,
                databaseApiStatus,
                metadataSource,
                httpPort,
                httpsPort,
                certificateBundle,
                documentRoot,
                advancedProperties,
                timeCreated,
                timeUpdated);
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
        sb.append("DatabaseToolsDatabaseApiGatewayConfigGlobalDefault(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsDatabaseApiGatewayConfigGlobalDefault)) {
            return false;
        }

        DatabaseToolsDatabaseApiGatewayConfigGlobalDefault other =
                (DatabaseToolsDatabaseApiGatewayConfigGlobalDefault) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
