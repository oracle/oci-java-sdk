/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * Updates the Exadata infrastructure.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateExadataInfrastructureDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateExadataInfrastructureDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
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

        public UpdateExadataInfrastructureDetails build() {
            UpdateExadataInfrastructureDetails __instance__ =
                    new UpdateExadataInfrastructureDetails(
                            cloudControlPlaneServer1,
                            cloudControlPlaneServer2,
                            netmask,
                            gateway,
                            adminNetworkCIDR,
                            infiniBandNetworkCIDR,
                            corporateProxy,
                            dnsServer,
                            ntpServer,
                            timeZone,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExadataInfrastructureDetails o) {
            Builder copiedBuilder =
                    cloudControlPlaneServer1(o.getCloudControlPlaneServer1())
                            .cloudControlPlaneServer2(o.getCloudControlPlaneServer2())
                            .netmask(o.getNetmask())
                            .gateway(o.getGateway())
                            .adminNetworkCIDR(o.getAdminNetworkCIDR())
                            .infiniBandNetworkCIDR(o.getInfiniBandNetworkCIDR())
                            .corporateProxy(o.getCorporateProxy())
                            .dnsServer(o.getDnsServer())
                            .ntpServer(o.getNtpServer())
                            .timeZone(o.getTimeZone())
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
     * The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    String timeZone;

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
