/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A summary of the SDDC.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SddcSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SddcSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        public Builder vmwareSoftwareVersion(String vmwareSoftwareVersion) {
            this.vmwareSoftwareVersion = vmwareSoftwareVersion;
            this.__explicitlySet__.add("vmwareSoftwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
        private String hcxFqdn;

        public Builder hcxFqdn(String hcxFqdn) {
            this.hcxFqdn = hcxFqdn;
            this.__explicitlySet__.add("hcxFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
        private Boolean isHcxEnabled;

        public Builder isHcxEnabled(Boolean isHcxEnabled) {
            this.isHcxEnabled = isHcxEnabled;
            this.__explicitlySet__.add("isHcxEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
        private String vcenterFqdn;

        public Builder vcenterFqdn(String vcenterFqdn) {
            this.vcenterFqdn = vcenterFqdn;
            this.__explicitlySet__.add("vcenterFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
        private String nsxManagerFqdn;

        public Builder nsxManagerFqdn(String nsxManagerFqdn) {
            this.nsxManagerFqdn = nsxManagerFqdn;
            this.__explicitlySet__.add("nsxManagerFqdn");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public SddcSummary build() {
            SddcSummary __instance__ =
                    new SddcSummary(
                            id,
                            computeAvailabilityDomain,
                            displayName,
                            vmwareSoftwareVersion,
                            compartmentId,
                            esxiHostsCount,
                            hcxFqdn,
                            isHcxEnabled,
                            vcenterFqdn,
                            nsxManagerFqdn,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SddcSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .computeAvailabilityDomain(o.getComputeAvailabilityDomain())
                            .displayName(o.getDisplayName())
                            .vmwareSoftwareVersion(o.getVmwareSoftwareVersion())
                            .compartmentId(o.getCompartmentId())
                            .esxiHostsCount(o.getEsxiHostsCount())
                            .hcxFqdn(o.getHcxFqdn())
                            .isHcxEnabled(o.getIsHcxEnabled())
                            .vcenterFqdn(o.getVcenterFqdn())
                            .nsxManagerFqdn(o.getNsxManagerFqdn())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The availability domain that the SDDC's ESXi hosts are running in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    String computeAvailabilityDomain;

    /**
     * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only letters, digits,
     * whitespaces, dashes and underscores.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * In general, this is a specific version of bundled VMware software supported by
     * Oracle Cloud VMware Solution (see
     * {@link #* ListSupportedVmwareSoftwareVersions(* ListSupportedVmwareSoftwareVersionsRequest) * ListSupportedVmwareSoftwareVersions}).
     * <p>
     * This attribute is not guaranteed to reflect the version of
     * software currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer
     * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `vmwareSoftwareVersion` with that new version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    String vmwareSoftwareVersion;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The number of ESXi hosts in the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    Integer esxiHostsCount;

    /**
     * HCX Fully Qualified Domain Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
    String hcxFqdn;

    /**
     * HCX enabled or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
    Boolean isHcxEnabled;

    /**
     * FQDN for vCenter
     * <p>
     * Example: `vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
    String vcenterFqdn;

    /**
     * FQDN for NSX Manager
     * <p>
     * Example: `nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
    String nsxManagerFqdn;

    /**
     * The date and time the SDDC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the SDDC was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
