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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = DatabaseToolsDatabaseApiGatewayConfigGlobal.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseToolsDatabaseApiGatewayConfigGlobalDefault.class,
            name = "DEFAULT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DatabaseToolsDatabaseApiGatewayConfigGlobal
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "poolRoute",
        "poolRoutingHeader",
        "databaseApiStatus",
        "metadataSource",
        "httpPort",
        "httpsPort",
        "certificateBundle",
        "documentRoot",
        "advancedProperties",
        "timeCreated",
        "timeUpdated"
    })
    protected DatabaseToolsDatabaseApiGatewayConfigGlobal(
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
        super();
        this.key = key;
        this.poolRoute = poolRoute;
        this.poolRoutingHeader = poolRoutingHeader;
        this.databaseApiStatus = databaseApiStatus;
        this.metadataSource = metadataSource;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.certificateBundle = certificateBundle;
        this.documentRoot = documentRoot;
        this.advancedProperties = advancedProperties;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * A string that uniquely identifies a Database Tools database API gateway config global
     * settings resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A string that uniquely identifies a Database Tools database API gateway config global
     * settings resource.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** How the target pool route value is determined for a HTTP request. */
    public enum PoolRoute implements com.oracle.bmc.http.internal.BmcEnum {
        Path("PATH"),
        Header("HEADER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PoolRoute.class);

        private final String value;
        private static java.util.Map<String, PoolRoute> map;

        static {
            map = new java.util.HashMap<>();
            for (PoolRoute v : PoolRoute.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PoolRoute(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PoolRoute create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PoolRoute', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** How the target pool route value is determined for a HTTP request. */
    @com.fasterxml.jackson.annotation.JsonProperty("poolRoute")
    private final PoolRoute poolRoute;

    /**
     * How the target pool route value is determined for a HTTP request.
     *
     * @return the value
     */
    public PoolRoute getPoolRoute() {
        return poolRoute;
    }

    /** The request header name providing the pool route value. */
    @com.fasterxml.jackson.annotation.JsonProperty("poolRoutingHeader")
    private final String poolRoutingHeader;

    /**
     * The request header name providing the pool route value.
     *
     * @return the value
     */
    public String getPoolRoutingHeader() {
        return poolRoutingHeader;
    }

    /**
     * ORDS database API is a database management and monitoring REST API. Database Actions requires
     * this feature.
     */
    public enum DatabaseApiStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseApiStatus.class);

        private final String value;
        private static java.util.Map<String, DatabaseApiStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseApiStatus v : DatabaseApiStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseApiStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseApiStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseApiStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * ORDS database API is a database management and monitoring REST API. Database Actions requires
     * this feature.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseApiStatus")
    private final DatabaseApiStatus databaseApiStatus;

    /**
     * ORDS database API is a database management and monitoring REST API. Database Actions requires
     * this feature.
     *
     * @return the value
     */
    public DatabaseApiStatus getDatabaseApiStatus() {
        return databaseApiStatus;
    }

    /** The RESTful service definition location. */
    public enum MetadataSource implements com.oracle.bmc.http.internal.BmcEnum {
        Database("DATABASE"),
        Cloud("CLOUD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MetadataSource.class);

        private final String value;
        private static java.util.Map<String, MetadataSource> map;

        static {
            map = new java.util.HashMap<>();
            for (MetadataSource v : MetadataSource.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MetadataSource(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetadataSource create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MetadataSource', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The RESTful service definition location. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataSource")
    private final MetadataSource metadataSource;

    /**
     * The RESTful service definition location.
     *
     * @return the value
     */
    public MetadataSource getMetadataSource() {
        return metadataSource;
    }

    /**
     * Specifies the HTTP listen port. 0 disables HTTP. Use of ports below 1024 requires elevated
     * (root) privileges and is generally discouraged; deployment on non-privileged ports
     * (1024\u201365535) is recommended.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpPort")
    private final Integer httpPort;

    /**
     * Specifies the HTTP listen port. 0 disables HTTP. Use of ports below 1024 requires elevated
     * (root) privileges and is generally discouraged; deployment on non-privileged ports
     * (1024\u201365535) is recommended.
     *
     * @return the value
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    /**
     * Specifies the HTTPS listen port. 0 disables HTTPS. Use of ports below 1024 requires elevated
     * (root) privileges and is generally discouraged; deployment on non-privileged ports
     * (1024\u201365535) is recommended. ORDS will use a self-signed certificate if a certificate
     * bundle is not provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpsPort")
    private final Integer httpsPort;

    /**
     * Specifies the HTTPS listen port. 0 disables HTTPS. Use of ports below 1024 requires elevated
     * (root) privileges and is generally discouraged; deployment on non-privileged ports
     * (1024\u201365535) is recommended. ORDS will use a self-signed certificate if a certificate
     * bundle is not provided.
     *
     * @return the value
     */
    public Integer getHttpsPort() {
        return httpsPort;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateBundle")
    private final DatabaseApiGatewayConfigCertificateBundle certificateBundle;

    public DatabaseApiGatewayConfigCertificateBundle getCertificateBundle() {
        return certificateBundle;
    }

    /** The location of the static resources to be served under the / root server path. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentRoot")
    private final String documentRoot;

    /**
     * The location of the static resources to be served under the / root server path.
     *
     * @return the value
     */
    public String getDocumentRoot() {
        return documentRoot;
    }

    /** Advanced global properties. */
    @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
    private final java.util.Map<String, String> advancedProperties;

    /**
     * Advanced global properties.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdvancedProperties() {
        return advancedProperties;
    }

    /** The time the resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the resource was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("DatabaseToolsDatabaseApiGatewayConfigGlobal(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", poolRoute=").append(String.valueOf(this.poolRoute));
        sb.append(", poolRoutingHeader=").append(String.valueOf(this.poolRoutingHeader));
        sb.append(", databaseApiStatus=").append(String.valueOf(this.databaseApiStatus));
        sb.append(", metadataSource=").append(String.valueOf(this.metadataSource));
        sb.append(", httpPort=").append(String.valueOf(this.httpPort));
        sb.append(", httpsPort=").append(String.valueOf(this.httpsPort));
        sb.append(", certificateBundle=").append(String.valueOf(this.certificateBundle));
        sb.append(", documentRoot=").append(String.valueOf(this.documentRoot));
        sb.append(", advancedProperties=").append(String.valueOf(this.advancedProperties));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsDatabaseApiGatewayConfigGlobal)) {
            return false;
        }

        DatabaseToolsDatabaseApiGatewayConfigGlobal other =
                (DatabaseToolsDatabaseApiGatewayConfigGlobal) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.poolRoute, other.poolRoute)
                && java.util.Objects.equals(this.poolRoutingHeader, other.poolRoutingHeader)
                && java.util.Objects.equals(this.databaseApiStatus, other.databaseApiStatus)
                && java.util.Objects.equals(this.metadataSource, other.metadataSource)
                && java.util.Objects.equals(this.httpPort, other.httpPort)
                && java.util.Objects.equals(this.httpsPort, other.httpsPort)
                && java.util.Objects.equals(this.certificateBundle, other.certificateBundle)
                && java.util.Objects.equals(this.documentRoot, other.documentRoot)
                && java.util.Objects.equals(this.advancedProperties, other.advancedProperties)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.poolRoute == null ? 43 : this.poolRoute.hashCode());
        result =
                (result * PRIME)
                        + (this.poolRoutingHeader == null ? 43 : this.poolRoutingHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseApiStatus == null ? 43 : this.databaseApiStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataSource == null ? 43 : this.metadataSource.hashCode());
        result = (result * PRIME) + (this.httpPort == null ? 43 : this.httpPort.hashCode());
        result = (result * PRIME) + (this.httpsPort == null ? 43 : this.httpsPort.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateBundle == null ? 43 : this.certificateBundle.hashCode());
        result = (result * PRIME) + (this.documentRoot == null ? 43 : this.documentRoot.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedProperties == null
                                ? 43
                                : this.advancedProperties.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
