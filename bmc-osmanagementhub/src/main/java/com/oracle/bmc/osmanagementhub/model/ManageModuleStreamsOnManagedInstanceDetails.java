/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * The set of changes to make to the state of the modules, streams, and profiles on a managed
 * instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManageModuleStreamsOnManagedInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManageModuleStreamsOnManagedInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isDryRun",
        "enable",
        "disable",
        "install",
        "remove",
        "workRequestDetails"
    })
    public ManageModuleStreamsOnManagedInstanceDetails(
            Boolean isDryRun,
            java.util.List<ModuleStreamDetails> enable,
            java.util.List<ModuleStreamDetails> disable,
            java.util.List<ModuleStreamProfileDetails> install,
            java.util.List<ModuleStreamProfileDetails> remove,
            WorkRequestDetails workRequestDetails) {
        super();
        this.isDryRun = isDryRun;
        this.enable = enable;
        this.disable = disable;
        this.install = install;
        this.remove = remove;
        this.workRequestDetails = workRequestDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates if this operation is a dry run or if the operation should be committed. If set
         * to true, the result of the operation will be evaluated but not committed. If set to
         * false, the operation is committed to the managed instance. The default is false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDryRun")
        private Boolean isDryRun;

        /**
         * Indicates if this operation is a dry run or if the operation should be committed. If set
         * to true, the result of the operation will be evaluated but not committed. If set to
         * false, the operation is committed to the managed instance. The default is false.
         *
         * @param isDryRun the value to set
         * @return this builder
         */
        public Builder isDryRun(Boolean isDryRun) {
            this.isDryRun = isDryRun;
            this.__explicitlySet__.add("isDryRun");
            return this;
        }
        /**
         * The set of module streams to enable. If any streams of a module are already enabled, the
         * service switches from the current stream to the new stream. Once complete, the streams
         * will be in 'ENABLED' status.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enable")
        private java.util.List<ModuleStreamDetails> enable;

        /**
         * The set of module streams to enable. If any streams of a module are already enabled, the
         * service switches from the current stream to the new stream. Once complete, the streams
         * will be in 'ENABLED' status.
         *
         * @param enable the value to set
         * @return this builder
         */
        public Builder enable(java.util.List<ModuleStreamDetails> enable) {
            this.enable = enable;
            this.__explicitlySet__.add("enable");
            return this;
        }
        /**
         * The set of module streams to disable. Any profiles that are installed for the module
         * stream will be removed as part of the operation. Once complete, the streams will be in
         * 'DISABLED' status.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disable")
        private java.util.List<ModuleStreamDetails> disable;

        /**
         * The set of module streams to disable. Any profiles that are installed for the module
         * stream will be removed as part of the operation. Once complete, the streams will be in
         * 'DISABLED' status.
         *
         * @param disable the value to set
         * @return this builder
         */
        public Builder disable(java.util.List<ModuleStreamDetails> disable) {
            this.disable = disable;
            this.__explicitlySet__.add("disable");
            return this;
        }
        /**
         * The set of module stream profiles to install. Any packages that are part of the profile
         * are installed on the managed instance. Once complete, the profile will be in 'INSTALLED'
         * status. The operation will return an error if you attempt to install a profile from a
         * disabled stream, unless enabling the new module stream is included in this operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("install")
        private java.util.List<ModuleStreamProfileDetails> install;

        /**
         * The set of module stream profiles to install. Any packages that are part of the profile
         * are installed on the managed instance. Once complete, the profile will be in 'INSTALLED'
         * status. The operation will return an error if you attempt to install a profile from a
         * disabled stream, unless enabling the new module stream is included in this operation.
         *
         * @param install the value to set
         * @return this builder
         */
        public Builder install(java.util.List<ModuleStreamProfileDetails> install) {
            this.install = install;
            this.__explicitlySet__.add("install");
            return this;
        }
        /**
         * The set of module stream profiles to remove. Once complete, the profile will be in
         * 'AVAILABLE' status. The status of packages within the profile after the operation is
         * complete is defined by the package manager on the managed instance group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remove")
        private java.util.List<ModuleStreamProfileDetails> remove;

        /**
         * The set of module stream profiles to remove. Once complete, the profile will be in
         * 'AVAILABLE' status. The status of packages within the profile after the operation is
         * complete is defined by the package manager on the managed instance group.
         *
         * @param remove the value to set
         * @return this builder
         */
        public Builder remove(java.util.List<ModuleStreamProfileDetails> remove) {
            this.remove = remove;
            this.__explicitlySet__.add("remove");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
        private WorkRequestDetails workRequestDetails;

        public Builder workRequestDetails(WorkRequestDetails workRequestDetails) {
            this.workRequestDetails = workRequestDetails;
            this.__explicitlySet__.add("workRequestDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManageModuleStreamsOnManagedInstanceDetails build() {
            ManageModuleStreamsOnManagedInstanceDetails model =
                    new ManageModuleStreamsOnManagedInstanceDetails(
                            this.isDryRun,
                            this.enable,
                            this.disable,
                            this.install,
                            this.remove,
                            this.workRequestDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageModuleStreamsOnManagedInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("isDryRun")) {
                this.isDryRun(model.getIsDryRun());
            }
            if (model.wasPropertyExplicitlySet("enable")) {
                this.enable(model.getEnable());
            }
            if (model.wasPropertyExplicitlySet("disable")) {
                this.disable(model.getDisable());
            }
            if (model.wasPropertyExplicitlySet("install")) {
                this.install(model.getInstall());
            }
            if (model.wasPropertyExplicitlySet("remove")) {
                this.remove(model.getRemove());
            }
            if (model.wasPropertyExplicitlySet("workRequestDetails")) {
                this.workRequestDetails(model.getWorkRequestDetails());
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
     * Indicates if this operation is a dry run or if the operation should be committed. If set to
     * true, the result of the operation will be evaluated but not committed. If set to false, the
     * operation is committed to the managed instance. The default is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDryRun")
    private final Boolean isDryRun;

    /**
     * Indicates if this operation is a dry run or if the operation should be committed. If set to
     * true, the result of the operation will be evaluated but not committed. If set to false, the
     * operation is committed to the managed instance. The default is false.
     *
     * @return the value
     */
    public Boolean getIsDryRun() {
        return isDryRun;
    }

    /**
     * The set of module streams to enable. If any streams of a module are already enabled, the
     * service switches from the current stream to the new stream. Once complete, the streams will
     * be in 'ENABLED' status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enable")
    private final java.util.List<ModuleStreamDetails> enable;

    /**
     * The set of module streams to enable. If any streams of a module are already enabled, the
     * service switches from the current stream to the new stream. Once complete, the streams will
     * be in 'ENABLED' status.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamDetails> getEnable() {
        return enable;
    }

    /**
     * The set of module streams to disable. Any profiles that are installed for the module stream
     * will be removed as part of the operation. Once complete, the streams will be in 'DISABLED'
     * status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disable")
    private final java.util.List<ModuleStreamDetails> disable;

    /**
     * The set of module streams to disable. Any profiles that are installed for the module stream
     * will be removed as part of the operation. Once complete, the streams will be in 'DISABLED'
     * status.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamDetails> getDisable() {
        return disable;
    }

    /**
     * The set of module stream profiles to install. Any packages that are part of the profile are
     * installed on the managed instance. Once complete, the profile will be in 'INSTALLED' status.
     * The operation will return an error if you attempt to install a profile from a disabled
     * stream, unless enabling the new module stream is included in this operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("install")
    private final java.util.List<ModuleStreamProfileDetails> install;

    /**
     * The set of module stream profiles to install. Any packages that are part of the profile are
     * installed on the managed instance. Once complete, the profile will be in 'INSTALLED' status.
     * The operation will return an error if you attempt to install a profile from a disabled
     * stream, unless enabling the new module stream is included in this operation.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamProfileDetails> getInstall() {
        return install;
    }

    /**
     * The set of module stream profiles to remove. Once complete, the profile will be in
     * 'AVAILABLE' status. The status of packages within the profile after the operation is complete
     * is defined by the package manager on the managed instance group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remove")
    private final java.util.List<ModuleStreamProfileDetails> remove;

    /**
     * The set of module stream profiles to remove. Once complete, the profile will be in
     * 'AVAILABLE' status. The status of packages within the profile after the operation is complete
     * is defined by the package manager on the managed instance group.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamProfileDetails> getRemove() {
        return remove;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
    private final WorkRequestDetails workRequestDetails;

    public WorkRequestDetails getWorkRequestDetails() {
        return workRequestDetails;
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
        sb.append("ManageModuleStreamsOnManagedInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isDryRun=").append(String.valueOf(this.isDryRun));
        sb.append(", enable=").append(String.valueOf(this.enable));
        sb.append(", disable=").append(String.valueOf(this.disable));
        sb.append(", install=").append(String.valueOf(this.install));
        sb.append(", remove=").append(String.valueOf(this.remove));
        sb.append(", workRequestDetails=").append(String.valueOf(this.workRequestDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageModuleStreamsOnManagedInstanceDetails)) {
            return false;
        }

        ManageModuleStreamsOnManagedInstanceDetails other =
                (ManageModuleStreamsOnManagedInstanceDetails) o;
        return java.util.Objects.equals(this.isDryRun, other.isDryRun)
                && java.util.Objects.equals(this.enable, other.enable)
                && java.util.Objects.equals(this.disable, other.disable)
                && java.util.Objects.equals(this.install, other.install)
                && java.util.Objects.equals(this.remove, other.remove)
                && java.util.Objects.equals(this.workRequestDetails, other.workRequestDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isDryRun == null ? 43 : this.isDryRun.hashCode());
        result = (result * PRIME) + (this.enable == null ? 43 : this.enable.hashCode());
        result = (result * PRIME) + (this.disable == null ? 43 : this.disable.hashCode());
        result = (result * PRIME) + (this.install == null ? 43 : this.install.hashCode());
        result = (result * PRIME) + (this.remove == null ? 43 : this.remove.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestDetails == null
                                ? 43
                                : this.workRequestDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
