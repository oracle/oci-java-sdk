/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * The data to create a DataIntelligence. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeployArtifactsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeployArtifactsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stackTemplates",
        "services",
        "subnetId",
        "adb",
        "ggcs",
        "dataflow",
        "omk",
        "oke"
    })
    public DeployArtifactsDetails(
            java.util.List<StackTemplate> stackTemplates,
            java.util.List<Service> services,
            String subnetId,
            java.util.List<AdbArtifactsDetail> adb,
            java.util.List<GgcsArtifactsDetail> ggcs,
            java.util.List<DataflowArtifactsDetail> dataflow,
            java.util.List<OmkArtifactsDetail> omk,
            java.util.List<OkeArtifactsDetail> oke) {
        super();
        this.stackTemplates = stackTemplates;
        this.services = services;
        this.subnetId = subnetId;
        this.adb = adb;
        this.ggcs = ggcs;
        this.dataflow = dataflow;
        this.omk = omk;
        this.oke = oke;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of templates to be onboarded for the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("stackTemplates")
        private java.util.List<StackTemplate> stackTemplates;

        /**
         * List of templates to be onboarded for the stack.
         *
         * @param stackTemplates the value to set
         * @return this builder
         */
        public Builder stackTemplates(java.util.List<StackTemplate> stackTemplates) {
            this.stackTemplates = stackTemplates;
            this.__explicitlySet__.add("stackTemplates");
            return this;
        }
        /** List of services to be onboarded for the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<Service> services;

        /**
         * List of services to be onboarded for the stack.
         *
         * @param services the value to set
         * @return this builder
         */
        public Builder services(java.util.List<Service> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }
        /** Subnet id for the Private Endpoint creation for artifact deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Subnet id for the Private Endpoint creation for artifact deployment.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** ADB artifact details if adb is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("adb")
        private java.util.List<AdbArtifactsDetail> adb;

        /**
         * ADB artifact details if adb is included in the services.
         *
         * @param adb the value to set
         * @return this builder
         */
        public Builder adb(java.util.List<AdbArtifactsDetail> adb) {
            this.adb = adb;
            this.__explicitlySet__.add("adb");
            return this;
        }
        /** GGCS artifact details if ggcs is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("ggcs")
        private java.util.List<GgcsArtifactsDetail> ggcs;

        /**
         * GGCS artifact details if ggcs is included in the services.
         *
         * @param ggcs the value to set
         * @return this builder
         */
        public Builder ggcs(java.util.List<GgcsArtifactsDetail> ggcs) {
            this.ggcs = ggcs;
            this.__explicitlySet__.add("ggcs");
            return this;
        }
        /** Dataflow artifact details if dataflow is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataflow")
        private java.util.List<DataflowArtifactsDetail> dataflow;

        /**
         * Dataflow artifact details if dataflow is included in the services.
         *
         * @param dataflow the value to set
         * @return this builder
         */
        public Builder dataflow(java.util.List<DataflowArtifactsDetail> dataflow) {
            this.dataflow = dataflow;
            this.__explicitlySet__.add("dataflow");
            return this;
        }
        /** Omk artifact details if omk is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("omk")
        private java.util.List<OmkArtifactsDetail> omk;

        /**
         * Omk artifact details if omk is included in the services.
         *
         * @param omk the value to set
         * @return this builder
         */
        public Builder omk(java.util.List<OmkArtifactsDetail> omk) {
            this.omk = omk;
            this.__explicitlySet__.add("omk");
            return this;
        }
        /** Oke artifact details if oke is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("oke")
        private java.util.List<OkeArtifactsDetail> oke;

        /**
         * Oke artifact details if oke is included in the services.
         *
         * @param oke the value to set
         * @return this builder
         */
        public Builder oke(java.util.List<OkeArtifactsDetail> oke) {
            this.oke = oke;
            this.__explicitlySet__.add("oke");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployArtifactsDetails build() {
            DeployArtifactsDetails model =
                    new DeployArtifactsDetails(
                            this.stackTemplates,
                            this.services,
                            this.subnetId,
                            this.adb,
                            this.ggcs,
                            this.dataflow,
                            this.omk,
                            this.oke);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployArtifactsDetails model) {
            if (model.wasPropertyExplicitlySet("stackTemplates")) {
                this.stackTemplates(model.getStackTemplates());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("adb")) {
                this.adb(model.getAdb());
            }
            if (model.wasPropertyExplicitlySet("ggcs")) {
                this.ggcs(model.getGgcs());
            }
            if (model.wasPropertyExplicitlySet("dataflow")) {
                this.dataflow(model.getDataflow());
            }
            if (model.wasPropertyExplicitlySet("omk")) {
                this.omk(model.getOmk());
            }
            if (model.wasPropertyExplicitlySet("oke")) {
                this.oke(model.getOke());
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

    /** List of templates to be onboarded for the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("stackTemplates")
    private final java.util.List<StackTemplate> stackTemplates;

    /**
     * List of templates to be onboarded for the stack.
     *
     * @return the value
     */
    public java.util.List<StackTemplate> getStackTemplates() {
        return stackTemplates;
    }

    /** List of services to be onboarded for the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<Service> services;

    /**
     * List of services to be onboarded for the stack.
     *
     * @return the value
     */
    public java.util.List<Service> getServices() {
        return services;
    }

    /** Subnet id for the Private Endpoint creation for artifact deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Subnet id for the Private Endpoint creation for artifact deployment.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** ADB artifact details if adb is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("adb")
    private final java.util.List<AdbArtifactsDetail> adb;

    /**
     * ADB artifact details if adb is included in the services.
     *
     * @return the value
     */
    public java.util.List<AdbArtifactsDetail> getAdb() {
        return adb;
    }

    /** GGCS artifact details if ggcs is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("ggcs")
    private final java.util.List<GgcsArtifactsDetail> ggcs;

    /**
     * GGCS artifact details if ggcs is included in the services.
     *
     * @return the value
     */
    public java.util.List<GgcsArtifactsDetail> getGgcs() {
        return ggcs;
    }

    /** Dataflow artifact details if dataflow is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataflow")
    private final java.util.List<DataflowArtifactsDetail> dataflow;

    /**
     * Dataflow artifact details if dataflow is included in the services.
     *
     * @return the value
     */
    public java.util.List<DataflowArtifactsDetail> getDataflow() {
        return dataflow;
    }

    /** Omk artifact details if omk is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("omk")
    private final java.util.List<OmkArtifactsDetail> omk;

    /**
     * Omk artifact details if omk is included in the services.
     *
     * @return the value
     */
    public java.util.List<OmkArtifactsDetail> getOmk() {
        return omk;
    }

    /** Oke artifact details if oke is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("oke")
    private final java.util.List<OkeArtifactsDetail> oke;

    /**
     * Oke artifact details if oke is included in the services.
     *
     * @return the value
     */
    public java.util.List<OkeArtifactsDetail> getOke() {
        return oke;
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
        sb.append("DeployArtifactsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("stackTemplates=").append(String.valueOf(this.stackTemplates));
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", adb=").append(String.valueOf(this.adb));
        sb.append(", ggcs=").append(String.valueOf(this.ggcs));
        sb.append(", dataflow=").append(String.valueOf(this.dataflow));
        sb.append(", omk=").append(String.valueOf(this.omk));
        sb.append(", oke=").append(String.valueOf(this.oke));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployArtifactsDetails)) {
            return false;
        }

        DeployArtifactsDetails other = (DeployArtifactsDetails) o;
        return java.util.Objects.equals(this.stackTemplates, other.stackTemplates)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.adb, other.adb)
                && java.util.Objects.equals(this.ggcs, other.ggcs)
                && java.util.Objects.equals(this.dataflow, other.dataflow)
                && java.util.Objects.equals(this.omk, other.omk)
                && java.util.Objects.equals(this.oke, other.oke)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.stackTemplates == null ? 43 : this.stackTemplates.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.adb == null ? 43 : this.adb.hashCode());
        result = (result * PRIME) + (this.ggcs == null ? 43 : this.ggcs.hashCode());
        result = (result * PRIME) + (this.dataflow == null ? 43 : this.dataflow.hashCode());
        result = (result * PRIME) + (this.omk == null ? 43 : this.omk.hashCode());
        result = (result * PRIME) + (this.oke == null ? 43 : this.oke.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
