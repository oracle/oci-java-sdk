/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an Oracle Autonomous Database by cloning an existing Autonomous Database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAutonomousDatabaseCloneDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateAutonomousDatabaseCloneDetails extends CreateAutonomousDatabaseBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
        private Boolean isFreeTier;

        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            this.__explicitlySet__.add("isFreeTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPreviewVersionWithServiceTermsAccepted")
        private Boolean isPreviewVersionWithServiceTermsAccepted;

        public Builder isPreviewVersionWithServiceTermsAccepted(
                Boolean isPreviewVersionWithServiceTermsAccepted) {
            this.isPreviewVersionWithServiceTermsAccepted =
                    isPreviewVersionWithServiceTermsAccepted;
            this.__explicitlySet__.add("isPreviewVersionWithServiceTermsAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
        private Boolean isDedicated;

        public Builder isDedicated(Boolean isDedicated) {
            this.isDedicated = isDedicated;
            this.__explicitlySet__.add("isDedicated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
        private String autonomousContainerDatabaseId;

        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            this.__explicitlySet__.add("autonomousContainerDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
        private java.util.List<String> whitelistedIps;

        public Builder whitelistedIps(java.util.List<String> whitelistedIps) {
            this.whitelistedIps = whitelistedIps;
            this.__explicitlySet__.add("whitelistedIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloneType")
        private CloneType cloneType;

        public Builder cloneType(CloneType cloneType) {
            this.cloneType = cloneType;
            this.__explicitlySet__.add("cloneType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousDatabaseCloneDetails build() {
            CreateAutonomousDatabaseCloneDetails __instance__ =
                    new CreateAutonomousDatabaseCloneDetails(
                            compartmentId,
                            dbName,
                            cpuCoreCount,
                            dbWorkload,
                            dataStorageSizeInTBs,
                            isFreeTier,
                            adminPassword,
                            displayName,
                            licenseModel,
                            isPreviewVersionWithServiceTermsAccepted,
                            isAutoScalingEnabled,
                            isDedicated,
                            autonomousContainerDatabaseId,
                            whitelistedIps,
                            freeformTags,
                            definedTags,
                            sourceId,
                            cloneType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousDatabaseCloneDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .dbName(o.getDbName())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .dbWorkload(o.getDbWorkload())
                            .dataStorageSizeInTBs(o.getDataStorageSizeInTBs())
                            .isFreeTier(o.getIsFreeTier())
                            .adminPassword(o.getAdminPassword())
                            .displayName(o.getDisplayName())
                            .licenseModel(o.getLicenseModel())
                            .isPreviewVersionWithServiceTermsAccepted(
                                    o.getIsPreviewVersionWithServiceTermsAccepted())
                            .isAutoScalingEnabled(o.getIsAutoScalingEnabled())
                            .isDedicated(o.getIsDedicated())
                            .autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId())
                            .whitelistedIps(o.getWhitelistedIps())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .sourceId(o.getSourceId())
                            .cloneType(o.getCloneType());

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

    @Deprecated
    public CreateAutonomousDatabaseCloneDetails(
            String compartmentId,
            String dbName,
            Integer cpuCoreCount,
            DbWorkload dbWorkload,
            Integer dataStorageSizeInTBs,
            Boolean isFreeTier,
            String adminPassword,
            String displayName,
            LicenseModel licenseModel,
            Boolean isPreviewVersionWithServiceTermsAccepted,
            Boolean isAutoScalingEnabled,
            Boolean isDedicated,
            String autonomousContainerDatabaseId,
            java.util.List<String> whitelistedIps,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String sourceId,
            CloneType cloneType) {
        super(
                compartmentId,
                dbName,
                cpuCoreCount,
                dbWorkload,
                dataStorageSizeInTBs,
                isFreeTier,
                adminPassword,
                displayName,
                licenseModel,
                isPreviewVersionWithServiceTermsAccepted,
                isAutoScalingEnabled,
                isDedicated,
                autonomousContainerDatabaseId,
                whitelistedIps,
                freeformTags,
                definedTags);
        this.sourceId = sourceId;
        this.cloneType = cloneType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that you will clone to create a new Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;
    /**
     * The Autonomous Database clone type.
     **/
    public enum CloneType {
        Full("FULL"),
        Metadata("METADATA"),
        ;

        private final String value;
        private static java.util.Map<String, CloneType> map;

        static {
            map = new java.util.HashMap<>();
            for (CloneType v : CloneType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CloneType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CloneType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid CloneType: " + key);
        }
    };
    /**
     * The Autonomous Database clone type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloneType")
    CloneType cloneType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
