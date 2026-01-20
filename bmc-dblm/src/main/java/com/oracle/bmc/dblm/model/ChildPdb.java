/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Child PDB for a CDB. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChildPdb.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChildPdb extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pdbId",
        "name",
        "openMode",
        "restricted",
        "recoveryStatus",
        "lastChangedBy"
    })
    public ChildPdb(
            String pdbId,
            String name,
            String openMode,
            String restricted,
            String recoveryStatus,
            String lastChangedBy) {
        super();
        this.pdbId = pdbId;
        this.name = name;
        this.openMode = openMode;
        this.restricted = restricted;
        this.recoveryStatus = recoveryStatus;
        this.lastChangedBy = lastChangedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier for the pluggable database. */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbId")
        private String pdbId;

        /**
         * Identifier for the pluggable database.
         *
         * @param pdbId the value to set
         * @return this builder
         */
        public Builder pdbId(String pdbId) {
            this.pdbId = pdbId;
            this.__explicitlySet__.add("pdbId");
            return this;
        }
        /** Name fo the pluggable database. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name fo the pluggable database.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Open mode */
        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private String openMode;

        /**
         * Open mode
         *
         * @param openMode the value to set
         * @return this builder
         */
        public Builder openMode(String openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }
        /** Restricted */
        @com.fasterxml.jackson.annotation.JsonProperty("restricted")
        private String restricted;

        /**
         * Restricted
         *
         * @param restricted the value to set
         * @return this builder
         */
        public Builder restricted(String restricted) {
            this.restricted = restricted;
            this.__explicitlySet__.add("restricted");
            return this;
        }
        /** Recovery status */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryStatus")
        private String recoveryStatus;

        /**
         * Recovery status
         *
         * @param recoveryStatus the value to set
         * @return this builder
         */
        public Builder recoveryStatus(String recoveryStatus) {
            this.recoveryStatus = recoveryStatus;
            this.__explicitlySet__.add("recoveryStatus");
            return this;
        }
        /** Last changed by */
        @com.fasterxml.jackson.annotation.JsonProperty("lastChangedBy")
        private String lastChangedBy;

        /**
         * Last changed by
         *
         * @param lastChangedBy the value to set
         * @return this builder
         */
        public Builder lastChangedBy(String lastChangedBy) {
            this.lastChangedBy = lastChangedBy;
            this.__explicitlySet__.add("lastChangedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChildPdb build() {
            ChildPdb model =
                    new ChildPdb(
                            this.pdbId,
                            this.name,
                            this.openMode,
                            this.restricted,
                            this.recoveryStatus,
                            this.lastChangedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChildPdb model) {
            if (model.wasPropertyExplicitlySet("pdbId")) {
                this.pdbId(model.getPdbId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("openMode")) {
                this.openMode(model.getOpenMode());
            }
            if (model.wasPropertyExplicitlySet("restricted")) {
                this.restricted(model.getRestricted());
            }
            if (model.wasPropertyExplicitlySet("recoveryStatus")) {
                this.recoveryStatus(model.getRecoveryStatus());
            }
            if (model.wasPropertyExplicitlySet("lastChangedBy")) {
                this.lastChangedBy(model.getLastChangedBy());
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

    /** Identifier for the pluggable database. */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbId")
    private final String pdbId;

    /**
     * Identifier for the pluggable database.
     *
     * @return the value
     */
    public String getPdbId() {
        return pdbId;
    }

    /** Name fo the pluggable database. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name fo the pluggable database.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Open mode */
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    private final String openMode;

    /**
     * Open mode
     *
     * @return the value
     */
    public String getOpenMode() {
        return openMode;
    }

    /** Restricted */
    @com.fasterxml.jackson.annotation.JsonProperty("restricted")
    private final String restricted;

    /**
     * Restricted
     *
     * @return the value
     */
    public String getRestricted() {
        return restricted;
    }

    /** Recovery status */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryStatus")
    private final String recoveryStatus;

    /**
     * Recovery status
     *
     * @return the value
     */
    public String getRecoveryStatus() {
        return recoveryStatus;
    }

    /** Last changed by */
    @com.fasterxml.jackson.annotation.JsonProperty("lastChangedBy")
    private final String lastChangedBy;

    /**
     * Last changed by
     *
     * @return the value
     */
    public String getLastChangedBy() {
        return lastChangedBy;
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
        sb.append("ChildPdb(");
        sb.append("super=").append(super.toString());
        sb.append("pdbId=").append(String.valueOf(this.pdbId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(", restricted=").append(String.valueOf(this.restricted));
        sb.append(", recoveryStatus=").append(String.valueOf(this.recoveryStatus));
        sb.append(", lastChangedBy=").append(String.valueOf(this.lastChangedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChildPdb)) {
            return false;
        }

        ChildPdb other = (ChildPdb) o;
        return java.util.Objects.equals(this.pdbId, other.pdbId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && java.util.Objects.equals(this.restricted, other.restricted)
                && java.util.Objects.equals(this.recoveryStatus, other.recoveryStatus)
                && java.util.Objects.equals(this.lastChangedBy, other.lastChangedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pdbId == null ? 43 : this.pdbId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        result = (result * PRIME) + (this.restricted == null ? 43 : this.restricted.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryStatus == null ? 43 : this.recoveryStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lastChangedBy == null ? 43 : this.lastChangedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
