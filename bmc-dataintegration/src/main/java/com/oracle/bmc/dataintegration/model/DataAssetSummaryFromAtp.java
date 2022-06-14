/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Summary details for the Autonomous Transaction Processing data asset type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataAssetSummaryFromAtp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataAssetSummaryFromAtp extends DataAssetSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetProperties")
        private java.util.Map<String, String> assetProperties;

        public Builder assetProperties(java.util.Map<String, String> assetProperties) {
            this.assetProperties = assetProperties;
            this.__explicitlySet__.add("assetProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nativeTypeSystem")
        private TypeSystem nativeTypeSystem;

        public Builder nativeTypeSystem(TypeSystem nativeTypeSystem) {
            this.nativeTypeSystem = nativeTypeSystem;
            this.__explicitlySet__.add("nativeTypeSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The Autonomous Transaction Processing instance service name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The Autonomous Transaction Processing instance service name.
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * Array of service names that are available for selection in the serviceName property.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceNames")
        private java.util.List<String> serviceNames;

        /**
         * Array of service names that are available for selection in the serviceName property.
         * @param serviceNames the value to set
         * @return this builder
         **/
        public Builder serviceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            this.__explicitlySet__.add("serviceNames");
            return this;
        }
        /**
         * The Autonomous Transaction Processing driver class.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
        private String driverClass;

        /**
         * The Autonomous Transaction Processing driver class.
         * @param driverClass the value to set
         * @return this builder
         **/
        public Builder driverClass(String driverClass) {
            this.driverClass = driverClass;
            this.__explicitlySet__.add("driverClass");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private ConnectionSummaryFromAtp defaultConnection;

        public Builder defaultConnection(ConnectionSummaryFromAtp defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataAssetSummaryFromAtp build() {
            DataAssetSummaryFromAtp __instance__ =
                    new DataAssetSummaryFromAtp(
                            key,
                            modelVersion,
                            name,
                            description,
                            objectStatus,
                            identifier,
                            externalKey,
                            assetProperties,
                            nativeTypeSystem,
                            objectVersion,
                            parentRef,
                            metadata,
                            serviceName,
                            serviceNames,
                            driverClass,
                            defaultConnection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataAssetSummaryFromAtp o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .externalKey(o.getExternalKey())
                            .assetProperties(o.getAssetProperties())
                            .nativeTypeSystem(o.getNativeTypeSystem())
                            .objectVersion(o.getObjectVersion())
                            .parentRef(o.getParentRef())
                            .metadata(o.getMetadata())
                            .serviceName(o.getServiceName())
                            .serviceNames(o.getServiceNames())
                            .driverClass(o.getDriverClass())
                            .defaultConnection(o.getDefaultConnection());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public DataAssetSummaryFromAtp(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            TypeSystem nativeTypeSystem,
            Integer objectVersion,
            ParentReference parentRef,
            ObjectMetadata metadata,
            String serviceName,
            java.util.List<String> serviceNames,
            String driverClass,
            ConnectionSummaryFromAtp defaultConnection) {
        super(
                key,
                modelVersion,
                name,
                description,
                objectStatus,
                identifier,
                externalKey,
                assetProperties,
                nativeTypeSystem,
                objectVersion,
                parentRef,
                metadata);
        this.serviceName = serviceName;
        this.serviceNames = serviceNames;
        this.driverClass = driverClass;
        this.defaultConnection = defaultConnection;
    }

    /**
     * The Autonomous Transaction Processing instance service name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The Autonomous Transaction Processing instance service name.
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Array of service names that are available for selection in the serviceName property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceNames")
    private final java.util.List<String> serviceNames;

    /**
     * Array of service names that are available for selection in the serviceName property.
     * @return the value
     **/
    public java.util.List<String> getServiceNames() {
        return serviceNames;
    }

    /**
     * The Autonomous Transaction Processing driver class.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
    private final String driverClass;

    /**
     * The Autonomous Transaction Processing driver class.
     * @return the value
     **/
    public String getDriverClass() {
        return driverClass;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final ConnectionSummaryFromAtp defaultConnection;

    public ConnectionSummaryFromAtp getDefaultConnection() {
        return defaultConnection;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataAssetSummaryFromAtp(");
        sb.append("super=").append(super.toString());
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", serviceNames=").append(String.valueOf(this.serviceNames));
        sb.append(", driverClass=").append(String.valueOf(this.driverClass));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataAssetSummaryFromAtp)) {
            return false;
        }

        DataAssetSummaryFromAtp other = (DataAssetSummaryFromAtp) o;
        return java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.serviceNames, other.serviceNames)
                && java.util.Objects.equals(this.driverClass, other.driverClass)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.serviceNames == null ? 43 : this.serviceNames.hashCode());
        result = (result * PRIME) + (this.driverClass == null ? 43 : this.driverClass.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
