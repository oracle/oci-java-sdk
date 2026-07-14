/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * An OCI File Storage Service (FSS) File System that can be mounted to Containers within a
 * Container Instance. Check
 * https://docs.oracle.com/en-us/iaas/api/#/en/filestorage/20171215/FileSystem for more details.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerOciFssVolume.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "volumeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerOciFssVolume extends ContainerVolume {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mountTarget")
        private OciFssMountTarget mountTarget;

        public Builder mountTarget(OciFssMountTarget mountTarget) {
            this.mountTarget = mountTarget;
            this.__explicitlySet__.add("mountTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("export")
        private OciFssExport export;

        public Builder export(OciFssExport export) {
            this.export = export;
            this.__explicitlySet__.add("export");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("security")
        private OciFssSecurity security;

        public Builder security(OciFssSecurity security) {
            this.security = security;
            this.__explicitlySet__.add("security");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mountCommand")
        private OciFssMountCommand mountCommand;

        public Builder mountCommand(OciFssMountCommand mountCommand) {
            this.mountCommand = mountCommand;
            this.__explicitlySet__.add("mountCommand");
            return this;
        }
        /**
         * Specifies the network interface to be used for the OCI File Storage Service (FSS) volume.
         * This is a required parameter when a Container Instance is attached to more than one
         * subnets.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Specifies the network interface to be used for the OCI File Storage Service (FSS) volume.
         * This is a required parameter when a Container Instance is attached to more than one
         * subnets.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerOciFssVolume build() {
            ContainerOciFssVolume model =
                    new ContainerOciFssVolume(
                            this.name,
                            this.mountTarget,
                            this.export,
                            this.security,
                            this.mountCommand,
                            this.subnetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerOciFssVolume model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("mountTarget")) {
                this.mountTarget(model.getMountTarget());
            }
            if (model.wasPropertyExplicitlySet("export")) {
                this.export(model.getExport());
            }
            if (model.wasPropertyExplicitlySet("security")) {
                this.security(model.getSecurity());
            }
            if (model.wasPropertyExplicitlySet("mountCommand")) {
                this.mountCommand(model.getMountCommand());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
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
    public ContainerOciFssVolume(
            String name,
            OciFssMountTarget mountTarget,
            OciFssExport export,
            OciFssSecurity security,
            OciFssMountCommand mountCommand,
            String subnetId) {
        super(name);
        this.mountTarget = mountTarget;
        this.export = export;
        this.security = security;
        this.mountCommand = mountCommand;
        this.subnetId = subnetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mountTarget")
    private final OciFssMountTarget mountTarget;

    public OciFssMountTarget getMountTarget() {
        return mountTarget;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("export")
    private final OciFssExport export;

    public OciFssExport getExport() {
        return export;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("security")
    private final OciFssSecurity security;

    public OciFssSecurity getSecurity() {
        return security;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mountCommand")
    private final OciFssMountCommand mountCommand;

    public OciFssMountCommand getMountCommand() {
        return mountCommand;
    }

    /**
     * Specifies the network interface to be used for the OCI File Storage Service (FSS) volume.
     * This is a required parameter when a Container Instance is attached to more than one subnets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Specifies the network interface to be used for the OCI File Storage Service (FSS) volume.
     * This is a required parameter when a Container Instance is attached to more than one subnets.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
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
        sb.append("ContainerOciFssVolume(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mountTarget=").append(String.valueOf(this.mountTarget));
        sb.append(", export=").append(String.valueOf(this.export));
        sb.append(", security=").append(String.valueOf(this.security));
        sb.append(", mountCommand=").append(String.valueOf(this.mountCommand));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerOciFssVolume)) {
            return false;
        }

        ContainerOciFssVolume other = (ContainerOciFssVolume) o;
        return java.util.Objects.equals(this.mountTarget, other.mountTarget)
                && java.util.Objects.equals(this.export, other.export)
                && java.util.Objects.equals(this.security, other.security)
                && java.util.Objects.equals(this.mountCommand, other.mountCommand)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mountTarget == null ? 43 : this.mountTarget.hashCode());
        result = (result * PRIME) + (this.export == null ? 43 : this.export.hashCode());
        result = (result * PRIME) + (this.security == null ? 43 : this.security.hashCode());
        result = (result * PRIME) + (this.mountCommand == null ? 43 : this.mountCommand.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        return result;
    }
}
