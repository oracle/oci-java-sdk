/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The shape used to launch instances associated with the dedicated VM host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DedicatedVmHostInstanceShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DedicatedVmHostInstanceShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "instanceShapeName",
        "supportedCapabilities"
    })
    public DedicatedVmHostInstanceShapeSummary(
            String availabilityDomain,
            String instanceShapeName,
            SupportedCapabilities supportedCapabilities) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.instanceShapeName = instanceShapeName;
        this.supportedCapabilities = supportedCapabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape's availability domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The shape's availability domain.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The name of the virtual machine instance shapes that can be launched on a dedicated VM
         * host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeName")
        private String instanceShapeName;

        /**
         * The name of the virtual machine instance shapes that can be launched on a dedicated VM
         * host.
         *
         * @param instanceShapeName the value to set
         * @return this builder
         */
        public Builder instanceShapeName(String instanceShapeName) {
            this.instanceShapeName = instanceShapeName;
            this.__explicitlySet__.add("instanceShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedCapabilities")
        private SupportedCapabilities supportedCapabilities;

        public Builder supportedCapabilities(SupportedCapabilities supportedCapabilities) {
            this.supportedCapabilities = supportedCapabilities;
            this.__explicitlySet__.add("supportedCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedVmHostInstanceShapeSummary build() {
            DedicatedVmHostInstanceShapeSummary model =
                    new DedicatedVmHostInstanceShapeSummary(
                            this.availabilityDomain,
                            this.instanceShapeName,
                            this.supportedCapabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedVmHostInstanceShapeSummary model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("instanceShapeName")) {
                this.instanceShapeName(model.getInstanceShapeName());
            }
            if (model.wasPropertyExplicitlySet("supportedCapabilities")) {
                this.supportedCapabilities(model.getSupportedCapabilities());
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

    /** The shape's availability domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The shape's availability domain.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The name of the virtual machine instance shapes that can be launched on a dedicated VM host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeName")
    private final String instanceShapeName;

    /**
     * The name of the virtual machine instance shapes that can be launched on a dedicated VM host.
     *
     * @return the value
     */
    public String getInstanceShapeName() {
        return instanceShapeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("supportedCapabilities")
    private final SupportedCapabilities supportedCapabilities;

    public SupportedCapabilities getSupportedCapabilities() {
        return supportedCapabilities;
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
        sb.append("DedicatedVmHostInstanceShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", instanceShapeName=").append(String.valueOf(this.instanceShapeName));
        sb.append(", supportedCapabilities=").append(String.valueOf(this.supportedCapabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DedicatedVmHostInstanceShapeSummary)) {
            return false;
        }

        DedicatedVmHostInstanceShapeSummary other = (DedicatedVmHostInstanceShapeSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.instanceShapeName, other.instanceShapeName)
                && java.util.Objects.equals(this.supportedCapabilities, other.supportedCapabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShapeName == null ? 43 : this.instanceShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedCapabilities == null
                                ? 43
                                : this.supportedCapabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
