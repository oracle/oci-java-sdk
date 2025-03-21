/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * VMcore information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KernelVmCoreInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KernelVmCoreInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"component", "backtrace"})
    public KernelVmCoreInformation(String component, String backtrace) {
        super();
        this.component = component;
        this.backtrace = backtrace;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Kernel module responsible of the crash. */
        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private String component;

        /**
         * Kernel module responsible of the crash.
         *
         * @param component the value to set
         * @return this builder
         */
        public Builder component(String component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }
        /** Crash backtrace. */
        @com.fasterxml.jackson.annotation.JsonProperty("backtrace")
        private String backtrace;

        /**
         * Crash backtrace.
         *
         * @param backtrace the value to set
         * @return this builder
         */
        public Builder backtrace(String backtrace) {
            this.backtrace = backtrace;
            this.__explicitlySet__.add("backtrace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KernelVmCoreInformation build() {
            KernelVmCoreInformation model =
                    new KernelVmCoreInformation(this.component, this.backtrace);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KernelVmCoreInformation model) {
            if (model.wasPropertyExplicitlySet("component")) {
                this.component(model.getComponent());
            }
            if (model.wasPropertyExplicitlySet("backtrace")) {
                this.backtrace(model.getBacktrace());
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

    /** Kernel module responsible of the crash. */
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    private final String component;

    /**
     * Kernel module responsible of the crash.
     *
     * @return the value
     */
    public String getComponent() {
        return component;
    }

    /** Crash backtrace. */
    @com.fasterxml.jackson.annotation.JsonProperty("backtrace")
    private final String backtrace;

    /**
     * Crash backtrace.
     *
     * @return the value
     */
    public String getBacktrace() {
        return backtrace;
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
        sb.append("KernelVmCoreInformation(");
        sb.append("super=").append(super.toString());
        sb.append("component=").append(String.valueOf(this.component));
        sb.append(", backtrace=").append(String.valueOf(this.backtrace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KernelVmCoreInformation)) {
            return false;
        }

        KernelVmCoreInformation other = (KernelVmCoreInformation) o;
        return java.util.Objects.equals(this.component, other.component)
                && java.util.Objects.equals(this.backtrace, other.backtrace)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.component == null ? 43 : this.component.hashCode());
        result = (result * PRIME) + (this.backtrace == null ? 43 : this.backtrace.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
