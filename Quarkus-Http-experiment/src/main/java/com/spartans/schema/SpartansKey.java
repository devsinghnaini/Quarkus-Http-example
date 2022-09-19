/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.spartans.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** This record contins metadata about the payload */
@org.apache.avro.specific.AvroGenerated
public class SpartansKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5863712184793094632L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SpartansKey\",\"namespace\":\"com.spartans.schema\",\"doc\":\"This record contins metadata about the payload\",\"fields\":[{\"name\":\"patientMrnIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"This field indicates mrn of a paitent if available\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SpartansKey> ENCODER =
      new BinaryMessageEncoder<SpartansKey>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SpartansKey> DECODER =
      new BinaryMessageDecoder<SpartansKey>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SpartansKey> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SpartansKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SpartansKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SpartansKey>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SpartansKey to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SpartansKey from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SpartansKey instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SpartansKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** This field indicates mrn of a paitent if available */
   private java.lang.CharSequence patientMrnIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SpartansKey() {}

  /**
   * All-args constructor.
   * @param patientMrnIdentifier This field indicates mrn of a paitent if available
   */
  public SpartansKey(java.lang.CharSequence patientMrnIdentifier) {
    this.patientMrnIdentifier = patientMrnIdentifier;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return patientMrnIdentifier;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: patientMrnIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'patientMrnIdentifier' field.
   * @return This field indicates mrn of a paitent if available
   */
  public java.lang.CharSequence getPatientMrnIdentifier() {
    return patientMrnIdentifier;
  }


  /**
   * Sets the value of the 'patientMrnIdentifier' field.
   * This field indicates mrn of a paitent if available
   * @param value the value to set.
   */
  public void setPatientMrnIdentifier(java.lang.CharSequence value) {
    this.patientMrnIdentifier = value;
  }

  /**
   * Creates a new SpartansKey RecordBuilder.
   * @return A new SpartansKey RecordBuilder
   */
  public static com.spartans.schema.SpartansKey.Builder newBuilder() {
    return new com.spartans.schema.SpartansKey.Builder();
  }

  /**
   * Creates a new SpartansKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SpartansKey RecordBuilder
   */
  public static com.spartans.schema.SpartansKey.Builder newBuilder(com.spartans.schema.SpartansKey.Builder other) {
    if (other == null) {
      return new com.spartans.schema.SpartansKey.Builder();
    } else {
      return new com.spartans.schema.SpartansKey.Builder(other);
    }
  }

  /**
   * Creates a new SpartansKey RecordBuilder by copying an existing SpartansKey instance.
   * @param other The existing instance to copy.
   * @return A new SpartansKey RecordBuilder
   */
  public static com.spartans.schema.SpartansKey.Builder newBuilder(com.spartans.schema.SpartansKey other) {
    if (other == null) {
      return new com.spartans.schema.SpartansKey.Builder();
    } else {
      return new com.spartans.schema.SpartansKey.Builder(other);
    }
  }

  /**
   * RecordBuilder for SpartansKey instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SpartansKey>
    implements org.apache.avro.data.RecordBuilder<SpartansKey> {

    /** This field indicates mrn of a paitent if available */
    private java.lang.CharSequence patientMrnIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.spartans.schema.SpartansKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.patientMrnIdentifier)) {
        this.patientMrnIdentifier = data().deepCopy(fields()[0].schema(), other.patientMrnIdentifier);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing SpartansKey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.spartans.schema.SpartansKey other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.patientMrnIdentifier)) {
        this.patientMrnIdentifier = data().deepCopy(fields()[0].schema(), other.patientMrnIdentifier);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'patientMrnIdentifier' field.
      * This field indicates mrn of a paitent if available
      * @return The value.
      */
    public java.lang.CharSequence getPatientMrnIdentifier() {
      return patientMrnIdentifier;
    }


    /**
      * Sets the value of the 'patientMrnIdentifier' field.
      * This field indicates mrn of a paitent if available
      * @param value The value of 'patientMrnIdentifier'.
      * @return This builder.
      */
    public com.spartans.schema.SpartansKey.Builder setPatientMrnIdentifier(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.patientMrnIdentifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'patientMrnIdentifier' field has been set.
      * This field indicates mrn of a paitent if available
      * @return True if the 'patientMrnIdentifier' field has been set, false otherwise.
      */
    public boolean hasPatientMrnIdentifier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'patientMrnIdentifier' field.
      * This field indicates mrn of a paitent if available
      * @return This builder.
      */
    public com.spartans.schema.SpartansKey.Builder clearPatientMrnIdentifier() {
      patientMrnIdentifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SpartansKey build() {
      try {
        SpartansKey record = new SpartansKey();
        record.patientMrnIdentifier = fieldSetFlags()[0] ? this.patientMrnIdentifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SpartansKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<SpartansKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SpartansKey>
    READER$ = (org.apache.avro.io.DatumReader<SpartansKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.patientMrnIdentifier == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.patientMrnIdentifier);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.patientMrnIdentifier = null;
      } else {
        this.patientMrnIdentifier = in.readString(this.patientMrnIdentifier instanceof Utf8 ? (Utf8)this.patientMrnIdentifier : null);
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.patientMrnIdentifier = null;
          } else {
            this.patientMrnIdentifier = in.readString(this.patientMrnIdentifier instanceof Utf8 ? (Utf8)this.patientMrnIdentifier : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










