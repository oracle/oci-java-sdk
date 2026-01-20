/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Terminates the preemptible instance when it is interrupted for eviction. <br>
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
        builder = TerminatePreemptionAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TerminatePreemptionAction extends PreemptionAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to preserve the boot volume that was used to launch the preemptible instance when
         * the instance is terminated. Defaults to false if not specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preserveBootVolume")
        private Boolean preserveBootVolume;

        /**
         * Whether to preserve the boot volume that was used to launch the preemptible instance when
         * the instance is terminated. Defaults to false if not specified.
         *
         * @param preserveBootVolume the value to set
         * @return this builder
         */
        public Builder preserveBootVolume(Boolean preserveBootVolume) {
            this.preserveBootVolume = preserveBootVolume;
            this.__explicitlySet__.add("preserveBootVolume");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TerminatePreemptionAction build() {
            TerminatePreemptionAction model =
                    new TerminatePreemptionAction(this.preserveBootVolume);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TerminatePreemptionAction model) {
            if (model.wasPropertyExplicitlySet("preserveBootVolume")) {
                this.preserveBootVolume(model.getPreserveBootVolume());
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
    public TerminatePreemptionAction(Boolean preserveBootVolume) {
        super();
        this.preserveBootVolume = preserveBootVolume;
    }

    /**
     * Whether to preserve the boot volume that was used to launch the preemptible instance when the
     * instance is terminated. Defaults to false if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preserveBootVolume")
    private final Boolean preserveBootVolume;

    /**
     * Whether to preserve the boot volume that was used to launch the preemptible instance when the
     * instance is terminated. Defaults to false if not specified.
     *
     * @return the value
     */
    public Boolean getPreserveBootVolume() {
        return preserveBootVolume;
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
        sb.append("TerminatePreemptionAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", preserveBootVolume=").append(String.valueOf(this.preserveBootVolume));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TerminatePreemptionAction)) {
            return false;
        }

        TerminatePreemptionAction other = (TerminatePreemptionAction) o;
        return java.util.Objects.equals(this.preserveBootVolume, other.preserveBootVolume)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.preserveBootVolume == null
                                ? 43
                                : this.preserveBootVolume.hashCode());
        return result;
    }
}
