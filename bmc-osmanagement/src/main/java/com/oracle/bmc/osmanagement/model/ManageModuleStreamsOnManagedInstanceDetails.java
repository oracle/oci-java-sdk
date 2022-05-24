/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * The set of changes to make to the state of the modules, streams, and profiles on a managed instance
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManageModuleStreamsOnManagedInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManageModuleStreamsOnManagedInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isDryRun")
        private Boolean isDryRun;

        public Builder isDryRun(Boolean isDryRun) {
            this.isDryRun = isDryRun;
            this.__explicitlySet__.add("isDryRun");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enable")
        private java.util.List<ModuleStreamDetails> enable;

        public Builder enable(java.util.List<ModuleStreamDetails> enable) {
            this.enable = enable;
            this.__explicitlySet__.add("enable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("disable")
        private java.util.List<ModuleStreamDetails> disable;

        public Builder disable(java.util.List<ModuleStreamDetails> disable) {
            this.disable = disable;
            this.__explicitlySet__.add("disable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("install")
        private java.util.List<ModuleStreamProfileDetails> install;

        public Builder install(java.util.List<ModuleStreamProfileDetails> install) {
            this.install = install;
            this.__explicitlySet__.add("install");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remove")
        private java.util.List<ModuleStreamProfileDetails> remove;

        public Builder remove(java.util.List<ModuleStreamProfileDetails> remove) {
            this.remove = remove;
            this.__explicitlySet__.add("remove");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManageModuleStreamsOnManagedInstanceDetails build() {
            ManageModuleStreamsOnManagedInstanceDetails __instance__ =
                    new ManageModuleStreamsOnManagedInstanceDetails(
                            isDryRun, enable, disable, install, remove);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageModuleStreamsOnManagedInstanceDetails o) {
            Builder copiedBuilder =
                    isDryRun(o.getIsDryRun())
                            .enable(o.getEnable())
                            .disable(o.getDisable())
                            .install(o.getInstall())
                            .remove(o.getRemove());

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
     * Indicates if this operation is a dry run or if the operation
     * should be commited.  If set to true, the result of the operation
     * will be evaluated but not committed.  If set to false, the
     * operation is committed to the managed instance.  The default is
     * false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDryRun")
    Boolean isDryRun;

    /**
     * The set of module streams to enable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enable")
    java.util.List<ModuleStreamDetails> enable;

    /**
     * The set of module streams to disable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disable")
    java.util.List<ModuleStreamDetails> disable;

    /**
     * The set of module stream profiles to install.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("install")
    java.util.List<ModuleStreamProfileDetails> install;

    /**
     * The set of module stream profiles to remove.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remove")
    java.util.List<ModuleStreamProfileDetails> remove;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
