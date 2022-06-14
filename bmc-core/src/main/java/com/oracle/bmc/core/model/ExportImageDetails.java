/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The destination details for the image export.
 * <p>
 * Set {@code destinationType} to {@code objectStorageTuple}
 * and use {@link #exportImageViaObjectStorageTupleDetails(ExportImageViaObjectStorageTupleDetailsRequest) exportImageViaObjectStorageTupleDetails}
 * when specifying the namespace, bucket name, and object name.
 * <p>
 * Set {@code destinationType} to {@code objectStorageUri} and
 * use {@link #exportImageViaObjectStorageUriDetails(ExportImageViaObjectStorageUriDetailsRequest) exportImageViaObjectStorageUriDetails}
 * when specifying the Object Storage URL.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "destinationType",
    defaultImpl = ExportImageDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExportImageViaObjectStorageUriDetails.class,
        name = "objectStorageUri"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExportImageViaObjectStorageTupleDetails.class,
        name = "objectStorageTuple"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExportImageDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"exportFormat"})
    protected ExportImageDetails(ExportFormat exportFormat) {
        super();
        this.exportFormat = exportFormat;
    }

    /**
     * The format to export the image to. The default value is {@code OCI}.
     * <p>
     * The following image formats are available:
     * <p>
     * - {@code OCI} - Oracle Cloud Infrastructure file with a QCOW2 image and Oracle Cloud Infrastructure metadata (.oci).
     * Use this format to export a custom image that you want to import into other tenancies or regions.
     * - {@code QCOW2} - QEMU Copy On Write (.qcow2)
     * - {@code VDI} - Virtual Disk Image (.vdi) for Oracle VM VirtualBox
     * - {@code VHD} - Virtual Hard Disk (.vhd) for Hyper-V
     * - {@code VMDK} - Virtual Machine Disk (.vmdk)
     *
     **/
    public enum ExportFormat {
        Qcow2("QCOW2"),
        Vmdk("VMDK"),
        Oci("OCI"),
        Vhd("VHD"),
        Vdi("VDI"),
        ;

        private final String value;
        private static java.util.Map<String, ExportFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (ExportFormat v : ExportFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExportFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExportFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExportFormat: " + key);
        }
    };
    /**
     * The format to export the image to. The default value is {@code OCI}.
     * <p>
     * The following image formats are available:
     * <p>
     * - {@code OCI} - Oracle Cloud Infrastructure file with a QCOW2 image and Oracle Cloud Infrastructure metadata (.oci).
     * Use this format to export a custom image that you want to import into other tenancies or regions.
     * - {@code QCOW2} - QEMU Copy On Write (.qcow2)
     * - {@code VDI} - Virtual Disk Image (.vdi) for Oracle VM VirtualBox
     * - {@code VHD} - Virtual Hard Disk (.vhd) for Hyper-V
     * - {@code VMDK} - Virtual Machine Disk (.vmdk)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportFormat")
    private final ExportFormat exportFormat;

    /**
     * The format to export the image to. The default value is {@code OCI}.
     * <p>
     * The following image formats are available:
     * <p>
     * - {@code OCI} - Oracle Cloud Infrastructure file with a QCOW2 image and Oracle Cloud Infrastructure metadata (.oci).
     * Use this format to export a custom image that you want to import into other tenancies or regions.
     * - {@code QCOW2} - QEMU Copy On Write (.qcow2)
     * - {@code VDI} - Virtual Disk Image (.vdi) for Oracle VM VirtualBox
     * - {@code VHD} - Virtual Hard Disk (.vhd) for Hyper-V
     * - {@code VMDK} - Virtual Machine Disk (.vmdk)
     *
     * @return the value
     **/
    public ExportFormat getExportFormat() {
        return exportFormat;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExportImageDetails(");
        sb.append("exportFormat=").append(String.valueOf(this.exportFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportImageDetails)) {
            return false;
        }

        ExportImageDetails other = (ExportImageDetails) o;
        return java.util.Objects.equals(this.exportFormat, other.exportFormat);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exportFormat == null ? 43 : this.exportFormat.hashCode());
        return result;
    }
}
