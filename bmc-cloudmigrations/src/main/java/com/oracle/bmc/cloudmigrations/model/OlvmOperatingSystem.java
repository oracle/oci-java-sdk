/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Information describing the operating system. This is used for both virtual machines and hosts.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmOperatingSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmOperatingSystem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "boot",
        "cmdLine",
        "customKernelCmdLine",
        "initRd",
        "kernel",
        "reportedKernelCmdLine",
        "type",
        "version"
    })
    public OlvmOperatingSystem(
            java.util.List<OlvmBootDevice> boot,
            String cmdLine,
            String customKernelCmdLine,
            String initRd,
            String kernel,
            String reportedKernelCmdLine,
            String type,
            OlvmVersion version) {
        super();
        this.boot = boot;
        this.cmdLine = cmdLine;
        this.customKernelCmdLine = customKernelCmdLine;
        this.initRd = initRd;
        this.kernel = kernel;
        this.reportedKernelCmdLine = reportedKernelCmdLine;
        this.type = type;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Configuration of the boot sequence of a virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("boot")
        private java.util.List<OlvmBootDevice> boot;

        /**
         * Configuration of the boot sequence of a virtual machine.
         *
         * @param boot the value to set
         * @return this builder
         */
        public Builder boot(java.util.List<OlvmBootDevice> boot) {
            this.boot = boot;
            this.__explicitlySet__.add("boot");
            return this;
        }
        /**
         * Custom kernel parameters for starting the virtual machine if Linux operating system is
         * used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cmdLine")
        private String cmdLine;

        /**
         * Custom kernel parameters for starting the virtual machine if Linux operating system is
         * used.
         *
         * @param cmdLine the value to set
         * @return this builder
         */
        public Builder cmdLine(String cmdLine) {
            this.cmdLine = cmdLine;
            this.__explicitlySet__.add("cmdLine");
            return this;
        }
        /** A custom part of the host kernel command line. */
        @com.fasterxml.jackson.annotation.JsonProperty("customKernelCmdLine")
        private String customKernelCmdLine;

        /**
         * A custom part of the host kernel command line.
         *
         * @param customKernelCmdLine the value to set
         * @return this builder
         */
        public Builder customKernelCmdLine(String customKernelCmdLine) {
            this.customKernelCmdLine = customKernelCmdLine;
            this.__explicitlySet__.add("customKernelCmdLine");
            return this;
        }
        /**
         * Path to custom initial ramdisk on ISO storage domain if Linux operating system is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initRd")
        private String initRd;

        /**
         * Path to custom initial ramdisk on ISO storage domain if Linux operating system is used.
         *
         * @param initRd the value to set
         * @return this builder
         */
        public Builder initRd(String initRd) {
            this.initRd = initRd;
            this.__explicitlySet__.add("initRd");
            return this;
        }
        /** Path to custom kernel on ISO storage domain if Linux operating system is used. */
        @com.fasterxml.jackson.annotation.JsonProperty("kernel")
        private String kernel;

        /**
         * Path to custom kernel on ISO storage domain if Linux operating system is used.
         *
         * @param kernel the value to set
         * @return this builder
         */
        public Builder kernel(String kernel) {
            this.kernel = kernel;
            this.__explicitlySet__.add("kernel");
            return this;
        }
        /** The host kernel command line as reported by a running host. */
        @com.fasterxml.jackson.annotation.JsonProperty("reportedKernelCmdLine")
        private String reportedKernelCmdLine;

        /**
         * The host kernel command line as reported by a running host.
         *
         * @param reportedKernelCmdLine the value to set
         * @return this builder
         */
        public Builder reportedKernelCmdLine(String reportedKernelCmdLine) {
            this.reportedKernelCmdLine = reportedKernelCmdLine;
            this.__explicitlySet__.add("reportedKernelCmdLine");
            return this;
        }
        /** Operating system name in human readable form */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Operating system name in human readable form
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private OlvmVersion version;

        public Builder version(OlvmVersion version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmOperatingSystem build() {
            OlvmOperatingSystem model =
                    new OlvmOperatingSystem(
                            this.boot,
                            this.cmdLine,
                            this.customKernelCmdLine,
                            this.initRd,
                            this.kernel,
                            this.reportedKernelCmdLine,
                            this.type,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmOperatingSystem model) {
            if (model.wasPropertyExplicitlySet("boot")) {
                this.boot(model.getBoot());
            }
            if (model.wasPropertyExplicitlySet("cmdLine")) {
                this.cmdLine(model.getCmdLine());
            }
            if (model.wasPropertyExplicitlySet("customKernelCmdLine")) {
                this.customKernelCmdLine(model.getCustomKernelCmdLine());
            }
            if (model.wasPropertyExplicitlySet("initRd")) {
                this.initRd(model.getInitRd());
            }
            if (model.wasPropertyExplicitlySet("kernel")) {
                this.kernel(model.getKernel());
            }
            if (model.wasPropertyExplicitlySet("reportedKernelCmdLine")) {
                this.reportedKernelCmdLine(model.getReportedKernelCmdLine());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** Configuration of the boot sequence of a virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("boot")
    private final java.util.List<OlvmBootDevice> boot;

    /**
     * Configuration of the boot sequence of a virtual machine.
     *
     * @return the value
     */
    public java.util.List<OlvmBootDevice> getBoot() {
        return boot;
    }

    /**
     * Custom kernel parameters for starting the virtual machine if Linux operating system is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cmdLine")
    private final String cmdLine;

    /**
     * Custom kernel parameters for starting the virtual machine if Linux operating system is used.
     *
     * @return the value
     */
    public String getCmdLine() {
        return cmdLine;
    }

    /** A custom part of the host kernel command line. */
    @com.fasterxml.jackson.annotation.JsonProperty("customKernelCmdLine")
    private final String customKernelCmdLine;

    /**
     * A custom part of the host kernel command line.
     *
     * @return the value
     */
    public String getCustomKernelCmdLine() {
        return customKernelCmdLine;
    }

    /** Path to custom initial ramdisk on ISO storage domain if Linux operating system is used. */
    @com.fasterxml.jackson.annotation.JsonProperty("initRd")
    private final String initRd;

    /**
     * Path to custom initial ramdisk on ISO storage domain if Linux operating system is used.
     *
     * @return the value
     */
    public String getInitRd() {
        return initRd;
    }

    /** Path to custom kernel on ISO storage domain if Linux operating system is used. */
    @com.fasterxml.jackson.annotation.JsonProperty("kernel")
    private final String kernel;

    /**
     * Path to custom kernel on ISO storage domain if Linux operating system is used.
     *
     * @return the value
     */
    public String getKernel() {
        return kernel;
    }

    /** The host kernel command line as reported by a running host. */
    @com.fasterxml.jackson.annotation.JsonProperty("reportedKernelCmdLine")
    private final String reportedKernelCmdLine;

    /**
     * The host kernel command line as reported by a running host.
     *
     * @return the value
     */
    public String getReportedKernelCmdLine() {
        return reportedKernelCmdLine;
    }

    /** Operating system name in human readable form */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Operating system name in human readable form
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final OlvmVersion version;

    public OlvmVersion getVersion() {
        return version;
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
        sb.append("OlvmOperatingSystem(");
        sb.append("super=").append(super.toString());
        sb.append("boot=").append(String.valueOf(this.boot));
        sb.append(", cmdLine=").append(String.valueOf(this.cmdLine));
        sb.append(", customKernelCmdLine=").append(String.valueOf(this.customKernelCmdLine));
        sb.append(", initRd=").append(String.valueOf(this.initRd));
        sb.append(", kernel=").append(String.valueOf(this.kernel));
        sb.append(", reportedKernelCmdLine=").append(String.valueOf(this.reportedKernelCmdLine));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmOperatingSystem)) {
            return false;
        }

        OlvmOperatingSystem other = (OlvmOperatingSystem) o;
        return java.util.Objects.equals(this.boot, other.boot)
                && java.util.Objects.equals(this.cmdLine, other.cmdLine)
                && java.util.Objects.equals(this.customKernelCmdLine, other.customKernelCmdLine)
                && java.util.Objects.equals(this.initRd, other.initRd)
                && java.util.Objects.equals(this.kernel, other.kernel)
                && java.util.Objects.equals(this.reportedKernelCmdLine, other.reportedKernelCmdLine)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.boot == null ? 43 : this.boot.hashCode());
        result = (result * PRIME) + (this.cmdLine == null ? 43 : this.cmdLine.hashCode());
        result =
                (result * PRIME)
                        + (this.customKernelCmdLine == null
                                ? 43
                                : this.customKernelCmdLine.hashCode());
        result = (result * PRIME) + (this.initRd == null ? 43 : this.initRd.hashCode());
        result = (result * PRIME) + (this.kernel == null ? 43 : this.kernel.hashCode());
        result =
                (result * PRIME)
                        + (this.reportedKernelCmdLine == null
                                ? 43
                                : this.reportedKernelCmdLine.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
