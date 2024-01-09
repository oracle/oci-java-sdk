/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * The set of changes to make to the state of the modules, streams, and profiles on the managed
 * target. <br>
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
        builder = ManageModuleStreamsInScheduledJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManageModuleStreamsInScheduledJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"enable", "disable", "install", "remove"})
    public ManageModuleStreamsInScheduledJobDetails(
            java.util.List<ModuleStreamDetails> enable,
            java.util.List<ModuleStreamDetails> disable,
            java.util.List<ModuleStreamProfileDetails> install,
            java.util.List<ModuleStreamProfileDetails> remove) {
        super();
        this.enable = enable;
        this.disable = disable;
        this.install = install;
        this.remove = remove;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The set of module streams to enable. */
        @com.fasterxml.jackson.annotation.JsonProperty("enable")
        private java.util.List<ModuleStreamDetails> enable;

        /**
         * The set of module streams to enable.
         *
         * @param enable the value to set
         * @return this builder
         */
        public Builder enable(java.util.List<ModuleStreamDetails> enable) {
            this.enable = enable;
            this.__explicitlySet__.add("enable");
            return this;
        }
        /** The set of module streams to disable. */
        @com.fasterxml.jackson.annotation.JsonProperty("disable")
        private java.util.List<ModuleStreamDetails> disable;

        /**
         * The set of module streams to disable.
         *
         * @param disable the value to set
         * @return this builder
         */
        public Builder disable(java.util.List<ModuleStreamDetails> disable) {
            this.disable = disable;
            this.__explicitlySet__.add("disable");
            return this;
        }
        /** The set of module stream profiles to install. */
        @com.fasterxml.jackson.annotation.JsonProperty("install")
        private java.util.List<ModuleStreamProfileDetails> install;

        /**
         * The set of module stream profiles to install.
         *
         * @param install the value to set
         * @return this builder
         */
        public Builder install(java.util.List<ModuleStreamProfileDetails> install) {
            this.install = install;
            this.__explicitlySet__.add("install");
            return this;
        }
        /** The set of module stream profiles to remove. */
        @com.fasterxml.jackson.annotation.JsonProperty("remove")
        private java.util.List<ModuleStreamProfileDetails> remove;

        /**
         * The set of module stream profiles to remove.
         *
         * @param remove the value to set
         * @return this builder
         */
        public Builder remove(java.util.List<ModuleStreamProfileDetails> remove) {
            this.remove = remove;
            this.__explicitlySet__.add("remove");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManageModuleStreamsInScheduledJobDetails build() {
            ManageModuleStreamsInScheduledJobDetails model =
                    new ManageModuleStreamsInScheduledJobDetails(
                            this.enable, this.disable, this.install, this.remove);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageModuleStreamsInScheduledJobDetails model) {
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

    /** The set of module streams to enable. */
    @com.fasterxml.jackson.annotation.JsonProperty("enable")
    private final java.util.List<ModuleStreamDetails> enable;

    /**
     * The set of module streams to enable.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamDetails> getEnable() {
        return enable;
    }

    /** The set of module streams to disable. */
    @com.fasterxml.jackson.annotation.JsonProperty("disable")
    private final java.util.List<ModuleStreamDetails> disable;

    /**
     * The set of module streams to disable.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamDetails> getDisable() {
        return disable;
    }

    /** The set of module stream profiles to install. */
    @com.fasterxml.jackson.annotation.JsonProperty("install")
    private final java.util.List<ModuleStreamProfileDetails> install;

    /**
     * The set of module stream profiles to install.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamProfileDetails> getInstall() {
        return install;
    }

    /** The set of module stream profiles to remove. */
    @com.fasterxml.jackson.annotation.JsonProperty("remove")
    private final java.util.List<ModuleStreamProfileDetails> remove;

    /**
     * The set of module stream profiles to remove.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamProfileDetails> getRemove() {
        return remove;
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
        sb.append("ManageModuleStreamsInScheduledJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("enable=").append(String.valueOf(this.enable));
        sb.append(", disable=").append(String.valueOf(this.disable));
        sb.append(", install=").append(String.valueOf(this.install));
        sb.append(", remove=").append(String.valueOf(this.remove));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageModuleStreamsInScheduledJobDetails)) {
            return false;
        }

        ManageModuleStreamsInScheduledJobDetails other =
                (ManageModuleStreamsInScheduledJobDetails) o;
        return java.util.Objects.equals(this.enable, other.enable)
                && java.util.Objects.equals(this.disable, other.disable)
                && java.util.Objects.equals(this.install, other.install)
                && java.util.Objects.equals(this.remove, other.remove)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.enable == null ? 43 : this.enable.hashCode());
        result = (result * PRIME) + (this.disable == null ? 43 : this.disable.hashCode());
        result = (result * PRIME) + (this.install == null ? 43 : this.install.hashCode());
        result = (result * PRIME) + (this.remove == null ? 43 : this.remove.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
