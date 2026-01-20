/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The network configurations used by Cluster, including
 * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management
 * subnet and VLANs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NetworkConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "provisioningSubnetId",
        "vsphereVlanId",
        "vmotionVlanId",
        "vsanVlanId",
        "nsxVTepVlanId",
        "nsxEdgeVTepVlanId",
        "nsxEdgeUplink1VlanId",
        "nsxEdgeUplink2VlanId",
        "replicationVlanId",
        "provisioningVlanId",
        "hcxVlanId"
    })
    public NetworkConfiguration(
            String provisioningSubnetId,
            String vsphereVlanId,
            String vmotionVlanId,
            String vsanVlanId,
            String nsxVTepVlanId,
            String nsxEdgeVTepVlanId,
            String nsxEdgeUplink1VlanId,
            String nsxEdgeUplink2VlanId,
            String replicationVlanId,
            String provisioningVlanId,
            String hcxVlanId) {
        super();
        this.provisioningSubnetId = provisioningSubnetId;
        this.vsphereVlanId = vsphereVlanId;
        this.vmotionVlanId = vmotionVlanId;
        this.vsanVlanId = vsanVlanId;
        this.nsxVTepVlanId = nsxVTepVlanId;
        this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
        this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
        this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
        this.replicationVlanId = replicationVlanId;
        this.provisioningVlanId = provisioningVlanId;
        this.hcxVlanId = hcxVlanId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * management subnet used to provision the Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
        private String provisioningSubnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * management subnet used to provision the Cluster.
         *
         * @param provisioningSubnetId the value to set
         * @return this builder
         */
        public Builder provisioningSubnetId(String provisioningSubnetId) {
            this.provisioningSubnetId = provisioningSubnetId;
            this.__explicitlySet__.add("provisioningSubnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSphere component of the VMware environment. This VLAN is a
         * mandatory attribute for Management Cluster.
         *
         * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the
         * ESXi hosts in the Cluster. The purpose of this attribute is to show the vSphere VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the vSphere component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the Cluster's {@code vsphereVlanId}
         * with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
        private String vsphereVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSphere component of the VMware environment. This VLAN is a
         * mandatory attribute for Management Cluster.
         *
         * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the
         * ESXi hosts in the Cluster. The purpose of this attribute is to show the vSphere VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the vSphere component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the Cluster's {@code vsphereVlanId}
         * with that new VLAN's OCID.
         *
         * @param vsphereVlanId the value to set
         * @return this builder
         */
        public Builder vsphereVlanId(String vsphereVlanId) {
            this.vsphereVlanId = vsphereVlanId;
            this.__explicitlySet__.add("vsphereVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the vMotion component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the
         * ESXi hosts in the Cluster. The purpose of this attribute is to show the vMotion VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the vMotion component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * vmotionVlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
        private String vmotionVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the vMotion component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the
         * ESXi hosts in the Cluster. The purpose of this attribute is to show the vMotion VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the vMotion component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * vmotionVlanId} with that new VLAN's OCID.
         *
         * @param vmotionVlanId the value to set
         * @return this builder
         */
        public Builder vmotionVlanId(String vmotionVlanId) {
            this.vmotionVlanId = vmotionVlanId;
            this.__explicitlySet__.add("vmotionVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the vSAN component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi
         * hosts in the Cluster. The purpose of this attribute is to show the vSAN VLAN that the
         * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the vSAN component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * vsanVlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
        private String vsanVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the vSAN component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi
         * hosts in the Cluster. The purpose of this attribute is to show the vSAN VLAN that the
         * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the vSAN component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * vsanVlanId} with that new VLAN's OCID.
         *
         * @param vsanVlanId the value to set
         * @return this builder
         */
        public Builder vsanVlanId(String vsanVlanId) {
            this.vsanVlanId = vsanVlanId;
            this.__explicitlySet__.add("vsanVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the NSX VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the
         * ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX VTEP VLAN
         * that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
         * this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX VTEP component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxVTepVlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
        private String nsxVTepVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the NSX VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the
         * ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX VTEP VLAN
         * that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
         * this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX VTEP component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxVTepVlanId} with that new VLAN's OCID.
         *
         * @param nsxVTepVlanId the value to set
         * @return this builder
         */
        public Builder nsxVTepVlanId(String nsxVTepVlanId) {
            this.nsxVTepVlanId = nsxVTepVlanId;
            this.__explicitlySet__.add("nsxVTepVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the NSX Edge VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by
         * the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge VTEP
         * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add
         * to this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX Edge VTEP component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxEdgeVTepVlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
        private String nsxEdgeVTepVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the NSX Edge VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by
         * the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge VTEP
         * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add
         * to this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX Edge VTEP component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxEdgeVTepVlanId} with that new VLAN's OCID.
         *
         * @param nsxEdgeVTepVlanId the value to set
         * @return this builder
         */
        public Builder nsxEdgeVTepVlanId(String nsxEdgeVTepVlanId) {
            this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
            this.__explicitlySet__.add("nsxEdgeVTepVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment. This
         * VLAN is a mandatory attribute for Management Cluster.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used
         * by the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge
         * Uplink 1 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this Cluster in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxEdgeUplink1VlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
        private String nsxEdgeUplink1VlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment. This
         * VLAN is a mandatory attribute for Management Cluster.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used
         * by the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge
         * Uplink 1 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this Cluster in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxEdgeUplink1VlanId} with that new VLAN's OCID.
         *
         * @param nsxEdgeUplink1VlanId the value to set
         * @return this builder
         */
        public Builder nsxEdgeUplink1VlanId(String nsxEdgeUplink1VlanId) {
            this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink1VlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment. This
         * VLAN is a mandatory attribute for Management Cluster.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used
         * by the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge
         * Uplink 2 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this Cluster in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxEdgeUplink2VlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
        private String nsxEdgeUplink2VlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment. This
         * VLAN is a mandatory attribute for Management Cluster.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used
         * by the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge
         * Uplink 2 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this Cluster in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different
         * VLAN for the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
         * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
         * nsxEdgeUplink2VlanId} with that new VLAN's OCID.
         *
         * @param nsxEdgeUplink2VlanId the value to set
         * @return this builder
         */
        public Builder nsxEdgeUplink2VlanId(String nsxEdgeUplink2VlanId) {
            this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink2VlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the vSphere Replication component of the VMware environment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
        private String replicationVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the vSphere Replication component of the VMware environment.
         *
         * @param replicationVlanId the value to set
         * @return this builder
         */
        public Builder replicationVlanId(String replicationVlanId) {
            this.replicationVlanId = replicationVlanId;
            this.__explicitlySet__.add("replicationVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the Provisioning component of the VMware environment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
        private String provisioningVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the Cluster for the Provisioning component of the VMware environment.
         *
         * @param provisioningVlanId the value to set
         * @return this builder
         */
        public Builder provisioningVlanId(String provisioningVlanId) {
            this.provisioningVlanId = provisioningVlanId;
            this.__explicitlySet__.add("provisioningVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the HCX component of the VMware environment. This VLAN is a
         * mandatory attribute for Management Cluster when HCX is enabled.
         *
         * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi
         * hosts in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle
         * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
         * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the HCX component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with
         * that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
        private String hcxVlanId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the HCX component of the VMware environment. This VLAN is a
         * mandatory attribute for Management Cluster when HCX is enabled.
         *
         * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi
         * hosts in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle
         * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
         * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the HCX component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with
         * that new VLAN's OCID.
         *
         * @param hcxVlanId the value to set
         * @return this builder
         */
        public Builder hcxVlanId(String hcxVlanId) {
            this.hcxVlanId = hcxVlanId;
            this.__explicitlySet__.add("hcxVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConfiguration build() {
            NetworkConfiguration model =
                    new NetworkConfiguration(
                            this.provisioningSubnetId,
                            this.vsphereVlanId,
                            this.vmotionVlanId,
                            this.vsanVlanId,
                            this.nsxVTepVlanId,
                            this.nsxEdgeVTepVlanId,
                            this.nsxEdgeUplink1VlanId,
                            this.nsxEdgeUplink2VlanId,
                            this.replicationVlanId,
                            this.provisioningVlanId,
                            this.hcxVlanId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConfiguration model) {
            if (model.wasPropertyExplicitlySet("provisioningSubnetId")) {
                this.provisioningSubnetId(model.getProvisioningSubnetId());
            }
            if (model.wasPropertyExplicitlySet("vsphereVlanId")) {
                this.vsphereVlanId(model.getVsphereVlanId());
            }
            if (model.wasPropertyExplicitlySet("vmotionVlanId")) {
                this.vmotionVlanId(model.getVmotionVlanId());
            }
            if (model.wasPropertyExplicitlySet("vsanVlanId")) {
                this.vsanVlanId(model.getVsanVlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxVTepVlanId")) {
                this.nsxVTepVlanId(model.getNsxVTepVlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeVTepVlanId")) {
                this.nsxEdgeVTepVlanId(model.getNsxEdgeVTepVlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeUplink1VlanId")) {
                this.nsxEdgeUplink1VlanId(model.getNsxEdgeUplink1VlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeUplink2VlanId")) {
                this.nsxEdgeUplink2VlanId(model.getNsxEdgeUplink2VlanId());
            }
            if (model.wasPropertyExplicitlySet("replicationVlanId")) {
                this.replicationVlanId(model.getReplicationVlanId());
            }
            if (model.wasPropertyExplicitlySet("provisioningVlanId")) {
                this.provisioningVlanId(model.getProvisioningVlanId());
            }
            if (model.wasPropertyExplicitlySet("hcxVlanId")) {
                this.hcxVlanId(model.getHcxVlanId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management subnet used to provision the Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
    private final String provisioningSubnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management subnet used to provision the Cluster.
     *
     * @return the value
     */
    public String getProvisioningSubnetId() {
        return provisioningSubnetId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the vSphere component of the VMware environment. This VLAN is a
     * mandatory attribute for Management Cluster.
     *
     * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the ESXi
     * hosts in the Cluster. The purpose of this attribute is to show the vSphere VLAN that the
     * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this Cluster in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the vSphere component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the Cluster's {@code vsphereVlanId} with
     * that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
    private final String vsphereVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the vSphere component of the VMware environment. This VLAN is a
     * mandatory attribute for Management Cluster.
     *
     * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the ESXi
     * hosts in the Cluster. The purpose of this attribute is to show the vSphere VLAN that the
     * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this Cluster in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the vSphere component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the Cluster's {@code vsphereVlanId} with
     * that new VLAN's OCID.
     *
     * @return the value
     */
    public String getVsphereVlanId() {
        return vsphereVlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the vMotion component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the ESXi
     * hosts in the Cluster. The purpose of this attribute is to show the vMotion VLAN that the
     * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this Cluster in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the vMotion component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * vmotionVlanId} with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
    private final String vmotionVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the vMotion component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the ESXi
     * hosts in the Cluster. The purpose of this attribute is to show the vMotion VLAN that the
     * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this Cluster in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the vMotion component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * vmotionVlanId} with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getVmotionVlanId() {
        return vmotionVlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the vSAN component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi hosts
     * in the Cluster. The purpose of this attribute is to show the vSAN VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this Cluster in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the vSAN component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * vsanVlanId} with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
    private final String vsanVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the vSAN component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi hosts
     * in the Cluster. The purpose of this attribute is to show the vSAN VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this Cluster in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the vSAN component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * vsanVlanId} with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getVsanVlanId() {
        return vsanVlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the NSX VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the ESXi
     * hosts in the Cluster. The purpose of this attribute is to show the NSX VTEP VLAN that the
     * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this Cluster in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX VTEP component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxVTepVlanId} with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
    private final String nsxVTepVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the NSX VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the ESXi
     * hosts in the Cluster. The purpose of this attribute is to show the NSX VTEP VLAN that the
     * Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this Cluster in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX VTEP component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxVTepVlanId} with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxVTepVlanId() {
        return nsxVTepVlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the NSX Edge VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by the
     * ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge VTEP VLAN
     * that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX Edge VTEP component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxEdgeVTepVlanId} with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
    private final String nsxEdgeVTepVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the NSX Edge VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by the
     * ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge VTEP VLAN
     * that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX Edge VTEP component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxEdgeVTepVlanId} with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxEdgeVTepVlanId() {
        return nsxEdgeVTepVlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment. This VLAN is
     * a mandatory attribute for Management Cluster.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used by
     * the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge Uplink 1
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
     * createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxEdgeUplink1VlanId} with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
    private final String nsxEdgeUplink1VlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment. This VLAN is
     * a mandatory attribute for Management Cluster.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used by
     * the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge Uplink 1
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
     * createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxEdgeUplink1VlanId} with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxEdgeUplink1VlanId() {
        return nsxEdgeUplink1VlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment. This VLAN is
     * a mandatory attribute for Management Cluster.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used by
     * the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge Uplink 2
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
     * createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxEdgeUplink2VlanId} with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
    private final String nsxEdgeUplink2VlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment. This VLAN is
     * a mandatory attribute for Management Cluster.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used by
     * the ESXi hosts in the Cluster. The purpose of this attribute is to show the NSX Edge Uplink 2
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
     * createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the Cluster to use a different VLAN
     * for the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
     * #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's {@code
     * nsxEdgeUplink2VlanId} with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxEdgeUplink2VlanId() {
        return nsxEdgeUplink2VlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the vSphere Replication component of the VMware environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
    private final String replicationVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the vSphere Replication component of the VMware environment.
     *
     * @return the value
     */
    public String getReplicationVlanId() {
        return replicationVlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the Provisioning component of the VMware environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
    private final String provisioningVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the Cluster for the Provisioning component of the VMware environment.
     *
     * @return the value
     */
    public String getProvisioningVlanId() {
        return provisioningVlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the HCX component of the VMware environment. This VLAN is a mandatory
     * attribute for Management Cluster when HCX is enabled.
     *
     * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi hosts
     * in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the HCX component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with that
     * new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
    private final String hcxVlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN
     * used by the SDDC for the HCX component of the VMware environment. This VLAN is a mandatory
     * attribute for Management Cluster when HCX is enabled.
     *
     * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi hosts
     * in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the HCX component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with that
     * new VLAN's OCID.
     *
     * @return the value
     */
    public String getHcxVlanId() {
        return hcxVlanId;
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
        sb.append("NetworkConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("provisioningSubnetId=").append(String.valueOf(this.provisioningSubnetId));
        sb.append(", vsphereVlanId=").append(String.valueOf(this.vsphereVlanId));
        sb.append(", vmotionVlanId=").append(String.valueOf(this.vmotionVlanId));
        sb.append(", vsanVlanId=").append(String.valueOf(this.vsanVlanId));
        sb.append(", nsxVTepVlanId=").append(String.valueOf(this.nsxVTepVlanId));
        sb.append(", nsxEdgeVTepVlanId=").append(String.valueOf(this.nsxEdgeVTepVlanId));
        sb.append(", nsxEdgeUplink1VlanId=").append(String.valueOf(this.nsxEdgeUplink1VlanId));
        sb.append(", nsxEdgeUplink2VlanId=").append(String.valueOf(this.nsxEdgeUplink2VlanId));
        sb.append(", replicationVlanId=").append(String.valueOf(this.replicationVlanId));
        sb.append(", provisioningVlanId=").append(String.valueOf(this.provisioningVlanId));
        sb.append(", hcxVlanId=").append(String.valueOf(this.hcxVlanId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkConfiguration)) {
            return false;
        }

        NetworkConfiguration other = (NetworkConfiguration) o;
        return java.util.Objects.equals(this.provisioningSubnetId, other.provisioningSubnetId)
                && java.util.Objects.equals(this.vsphereVlanId, other.vsphereVlanId)
                && java.util.Objects.equals(this.vmotionVlanId, other.vmotionVlanId)
                && java.util.Objects.equals(this.vsanVlanId, other.vsanVlanId)
                && java.util.Objects.equals(this.nsxVTepVlanId, other.nsxVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeVTepVlanId, other.nsxEdgeVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink1VlanId, other.nsxEdgeUplink1VlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink2VlanId, other.nsxEdgeUplink2VlanId)
                && java.util.Objects.equals(this.replicationVlanId, other.replicationVlanId)
                && java.util.Objects.equals(this.provisioningVlanId, other.provisioningVlanId)
                && java.util.Objects.equals(this.hcxVlanId, other.hcxVlanId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.provisioningSubnetId == null
                                ? 43
                                : this.provisioningSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.vsphereVlanId == null ? 43 : this.vsphereVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.vmotionVlanId == null ? 43 : this.vmotionVlanId.hashCode());
        result = (result * PRIME) + (this.vsanVlanId == null ? 43 : this.vsanVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxVTepVlanId == null ? 43 : this.nsxVTepVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeVTepVlanId == null ? 43 : this.nsxEdgeVTepVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplink1VlanId == null
                                ? 43
                                : this.nsxEdgeUplink1VlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplink2VlanId == null
                                ? 43
                                : this.nsxEdgeUplink2VlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationVlanId == null ? 43 : this.replicationVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningVlanId == null
                                ? 43
                                : this.provisioningVlanId.hashCode());
        result = (result * PRIME) + (this.hcxVlanId == null ? 43 : this.hcxVlanId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
