/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) Identity domain replication states.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DomainReplication.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DomainReplication extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"opcWaterMark", "txnSeqNumber", "domainReplicationStates"})
    public DomainReplication(
            java.math.BigDecimal opcWaterMark,
            java.math.BigDecimal txnSeqNumber,
            java.util.List<DomainReplicationStates> domainReplicationStates) {
        super();
        this.opcWaterMark = opcWaterMark;
        this.txnSeqNumber = txnSeqNumber;
        this.domainReplicationStates = domainReplicationStates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The version number indicating the value of kievTxnId, starting from which the identity domain replication events need to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opcWaterMark")
        private java.math.BigDecimal opcWaterMark;

        /**
         * The version number indicating the value of kievTxnId, starting from which the identity domain replication events need to be returned.
         * @param opcWaterMark the value to set
         * @return this builder
         **/
        public Builder opcWaterMark(java.math.BigDecimal opcWaterMark) {
            this.opcWaterMark = opcWaterMark;
            this.__explicitlySet__.add("opcWaterMark");
            return this;
        }
        /**
         * A custom value defining the order of records with the same kievTxnId.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("txnSeqNumber")
        private java.math.BigDecimal txnSeqNumber;

        /**
         * A custom value defining the order of records with the same kievTxnId.
         * @param txnSeqNumber the value to set
         * @return this builder
         **/
        public Builder txnSeqNumber(java.math.BigDecimal txnSeqNumber) {
            this.txnSeqNumber = txnSeqNumber;
            this.__explicitlySet__.add("txnSeqNumber");
            return this;
        }
        /**
         * The identity domain's replication state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainReplicationStates")
        private java.util.List<DomainReplicationStates> domainReplicationStates;

        /**
         * The identity domain's replication state.
         * @param domainReplicationStates the value to set
         * @return this builder
         **/
        public Builder domainReplicationStates(
                java.util.List<DomainReplicationStates> domainReplicationStates) {
            this.domainReplicationStates = domainReplicationStates;
            this.__explicitlySet__.add("domainReplicationStates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DomainReplication build() {
            DomainReplication model =
                    new DomainReplication(
                            this.opcWaterMark, this.txnSeqNumber, this.domainReplicationStates);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DomainReplication model) {
            if (model.wasPropertyExplicitlySet("opcWaterMark")) {
                this.opcWaterMark(model.getOpcWaterMark());
            }
            if (model.wasPropertyExplicitlySet("txnSeqNumber")) {
                this.txnSeqNumber(model.getTxnSeqNumber());
            }
            if (model.wasPropertyExplicitlySet("domainReplicationStates")) {
                this.domainReplicationStates(model.getDomainReplicationStates());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The version number indicating the value of kievTxnId, starting from which the identity domain replication events need to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opcWaterMark")
    private final java.math.BigDecimal opcWaterMark;

    /**
     * The version number indicating the value of kievTxnId, starting from which the identity domain replication events need to be returned.
     * @return the value
     **/
    public java.math.BigDecimal getOpcWaterMark() {
        return opcWaterMark;
    }

    /**
     * A custom value defining the order of records with the same kievTxnId.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("txnSeqNumber")
    private final java.math.BigDecimal txnSeqNumber;

    /**
     * A custom value defining the order of records with the same kievTxnId.
     * @return the value
     **/
    public java.math.BigDecimal getTxnSeqNumber() {
        return txnSeqNumber;
    }

    /**
     * The identity domain's replication state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainReplicationStates")
    private final java.util.List<DomainReplicationStates> domainReplicationStates;

    /**
     * The identity domain's replication state.
     * @return the value
     **/
    public java.util.List<DomainReplicationStates> getDomainReplicationStates() {
        return domainReplicationStates;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DomainReplication(");
        sb.append("super=").append(super.toString());
        sb.append("opcWaterMark=").append(String.valueOf(this.opcWaterMark));
        sb.append(", txnSeqNumber=").append(String.valueOf(this.txnSeqNumber));
        sb.append(", domainReplicationStates=")
                .append(String.valueOf(this.domainReplicationStates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DomainReplication)) {
            return false;
        }

        DomainReplication other = (DomainReplication) o;
        return java.util.Objects.equals(this.opcWaterMark, other.opcWaterMark)
                && java.util.Objects.equals(this.txnSeqNumber, other.txnSeqNumber)
                && java.util.Objects.equals(
                        this.domainReplicationStates, other.domainReplicationStates)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.opcWaterMark == null ? 43 : this.opcWaterMark.hashCode());
        result = (result * PRIME) + (this.txnSeqNumber == null ? 43 : this.txnSeqNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.domainReplicationStates == null
                                ? 43
                                : this.domainReplicationStates.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
