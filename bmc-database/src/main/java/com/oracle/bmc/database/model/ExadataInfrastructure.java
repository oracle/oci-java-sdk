/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * ExadataInfrastructure
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataInfrastructure.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExadataInfrastructure {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
        private Integer cpusEnabled;

        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = cpusEnabled;
            this.__explicitlySet__.add("cpusEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
        private Integer maxCpuCount;

        public Builder maxCpuCount(Integer maxCpuCount) {
            this.maxCpuCount = maxCpuCount;
            this.__explicitlySet__.add("maxCpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
        private Integer maxMemoryInGBs;

        public Builder maxMemoryInGBs(Integer maxMemoryInGBs) {
            this.maxMemoryInGBs = maxMemoryInGBs;
            this.__explicitlySet__.add("maxMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
        private Integer maxDbNodeStorageInGBs;

        public Builder maxDbNodeStorageInGBs(Integer maxDbNodeStorageInGBs) {
            this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
            this.__explicitlySet__.add("maxDbNodeStorageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxDataStorageInTBs")
        private Double maxDataStorageInTBs;

        public Builder maxDataStorageInTBs(Double maxDataStorageInTBs) {
            this.maxDataStorageInTBs = maxDataStorageInTBs;
            this.__explicitlySet__.add("maxDataStorageInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer1")
        private String cloudControlPlaneServer1;

        public Builder cloudControlPlaneServer1(String cloudControlPlaneServer1) {
            this.cloudControlPlaneServer1 = cloudControlPlaneServer1;
            this.__explicitlySet__.add("cloudControlPlaneServer1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer2")
        private String cloudControlPlaneServer2;

        public Builder cloudControlPlaneServer2(String cloudControlPlaneServer2) {
            this.cloudControlPlaneServer2 = cloudControlPlaneServer2;
            this.__explicitlySet__.add("cloudControlPlaneServer2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminNetworkCIDR")
        private String adminNetworkCIDR;

        public Builder adminNetworkCIDR(String adminNetworkCIDR) {
            this.adminNetworkCIDR = adminNetworkCIDR;
            this.__explicitlySet__.add("adminNetworkCIDR");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infiniBandNetworkCIDR")
        private String infiniBandNetworkCIDR;

        public Builder infiniBandNetworkCIDR(String infiniBandNetworkCIDR) {
            this.infiniBandNetworkCIDR = infiniBandNetworkCIDR;
            this.__explicitlySet__.add("infiniBandNetworkCIDR");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("corporateProxy")
        private String corporateProxy;

        public Builder corporateProxy(String corporateProxy) {
            this.corporateProxy = corporateProxy;
            this.__explicitlySet__.add("corporateProxy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsServer")
        private java.util.List<String> dnsServer;

        public Builder dnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            this.__explicitlySet__.add("dnsServer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ntpServer")
        private java.util.List<String> ntpServer;

        public Builder ntpServer(java.util.List<String> ntpServer) {
            this.ntpServer = ntpServer;
            this.__explicitlySet__.add("ntpServer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInfrastructure build() {
            ExadataInfrastructure __instance__ =
                    new ExadataInfrastructure(
                            id,
                            compartmentId,
                            lifecycleState,
                            displayName,
                            shape,
                            timeZone,
                            cpusEnabled,
                            maxCpuCount,
                            memorySizeInGBs,
                            maxMemoryInGBs,
                            dbNodeStorageSizeInGBs,
                            maxDbNodeStorageInGBs,
                            dataStorageSizeInTBs,
                            maxDataStorageInTBs,
                            cloudControlPlaneServer1,
                            cloudControlPlaneServer2,
                            netmask,
                            gateway,
                            adminNetworkCIDR,
                            infiniBandNetworkCIDR,
                            corporateProxy,
                            dnsServer,
                            ntpServer,
                            timeCreated,
                            lifecycleDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInfrastructure o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .lifecycleState(o.getLifecycleState())
                            .displayName(o.getDisplayName())
                            .shape(o.getShape())
                            .timeZone(o.getTimeZone())
                            .cpusEnabled(o.getCpusEnabled())
                            .maxCpuCount(o.getMaxCpuCount())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .maxMemoryInGBs(o.getMaxMemoryInGBs())
                            .dbNodeStorageSizeInGBs(o.getDbNodeStorageSizeInGBs())
                            .maxDbNodeStorageInGBs(o.getMaxDbNodeStorageInGBs())
                            .dataStorageSizeInTBs(o.getDataStorageSizeInTBs())
                            .maxDataStorageInTBs(o.getMaxDataStorageInTBs())
                            .cloudControlPlaneServer1(o.getCloudControlPlaneServer1())
                            .cloudControlPlaneServer2(o.getCloudControlPlaneServer2())
                            .netmask(o.getNetmask())
                            .gateway(o.getGateway())
                            .adminNetworkCIDR(o.getAdminNetworkCIDR())
                            .infiniBandNetworkCIDR(o.getInfiniBandNetworkCIDR())
                            .corporateProxy(o.getCorporateProxy())
                            .dnsServer(o.getDnsServer())
                            .ntpServer(o.getNtpServer())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;
    /**
     * The current lifecycle state of the Exadata infrastructure.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        RequiresActivation("REQUIRES_ACTIVATION"),
        Activating("ACTIVATING"),
        Active("ACTIVE"),
        ActivationFailed("ACTIVATION_FAILED"),
        Failed("FAILED"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Disconnected("DISCONNECTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current lifecycle state of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The user-friendly name for the Exadata infrastructure. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and memory resources allocated to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    String timeZone;

    /**
     * The number of enabled CPU cores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
    Integer cpusEnabled;

    /**
     * The total number of CPU cores available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
    Integer maxCpuCount;

    /**
     * The memory allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    Integer memorySizeInGBs;

    /**
     * The total memory available in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
    Integer maxMemoryInGBs;

    /**
     * The local node storage allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    Integer dbNodeStorageSizeInGBs;

    /**
     * The total local node storage available in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
    Integer maxDbNodeStorageInGBs;

    /**
     * Size, in terabytes, of the DATA disk group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    Double dataStorageSizeInTBs;

    /**
     * The total available DATA disk group size.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDataStorageInTBs")
    Double maxDataStorageInTBs;

    /**
     * The IP address for the first control plane server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer1")
    String cloudControlPlaneServer1;

    /**
     * The IP address for the second control plane server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudControlPlaneServer2")
    String cloudControlPlaneServer2;

    /**
     * The netmask for the control plane network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    String netmask;

    /**
     * The gateway for the control plane network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    String gateway;

    /**
     * The CIDR block for the Exadata administration network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminNetworkCIDR")
    String adminNetworkCIDR;

    /**
     * The CIDR block for the Exadata InfiniBand interconnect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infiniBandNetworkCIDR")
    String infiniBandNetworkCIDR;

    /**
     * The corporate network proxy for access to the control plane network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("corporateProxy")
    String corporateProxy;

    /**
     * The list of DNS server IP addresses. Maximum of 3 allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServer")
    java.util.List<String> dnsServer;

    /**
     * The list of NTP server IP addresses. Maximum of 3 allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ntpServer")
    java.util.List<String> ntpServer;

    /**
     * The date and time the Exadata infrastructure was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
