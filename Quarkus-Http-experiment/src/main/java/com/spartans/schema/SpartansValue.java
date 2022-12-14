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
public class SpartansValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3842884171322737207L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SpartansValue\",\"namespace\":\"com.spartans.schema\",\"doc\":\"This record contins metadata about the payload\",\"fields\":[{\"name\":\"medData\",\"type\":[\"null\",\"bytes\"],\"doc\":\"This field indicates the payload in its byte form\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SpartansValue> ENCODER =
      new BinaryMessageEncoder<SpartansValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SpartansValue> DECODER =
      new BinaryMessageDecoder<SpartansValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SpartansValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SpartansValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SpartansValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SpartansValue>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SpartansValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SpartansValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SpartansValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SpartansValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** This field indicates the payload in its byte form */
   private java.nio.ByteBuffer medData;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SpartansValue() {}

  /**
   * All-args constructor.
   * @param medData This field indicates the payload in its byte form
   */
  public SpartansValue(java.nio.ByteBuffer medData) {
    this.medData = medData;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return medData;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: medData = (java.nio.ByteBuffer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'medData' field.
   * @return This field indicates the payload in its byte form
   */
  public java.nio.ByteBuffer getMedData() {
    return medData;
  }


  /**
   * Sets the value of the 'medData' field.
   * This field indicates the payload in its byte form
   * @param value the value to set.
   */
  public void setMedData(java.nio.ByteBuffer value) {
    this.medData = value;
  }

  /**
   * Creates a new SpartansValue RecordBuilder.
   * @return A new SpartansValue RecordBuilder
   */
  public static com.spartans.schema.SpartansValue.Builder newBuilder() {
    return new com.spartans.schema.SpartansValue.Builder();
  }

  /**
   * Creates a new SpartansValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SpartansValue RecordBuilder
   */
  public static com.spartans.schema.SpartansValue.Builder newBuilder(com.spartans.schema.SpartansValue.Builder other) {
    if (other == null) {
      return new com.spartans.schema.SpartansValue.Builder();
    } else {
      return new com.spartans.schema.SpartansValue.Builder(other);
    }
  }

  /**
   * Creates a new SpartansValue RecordBuilder by copying an existing SpartansValue instance.
   * @param other The existing instance to copy.
   * @return A new SpartansValue RecordBuilder
   */
  public static com.spartans.schema.SpartansValue.Builder newBuilder(com.spartans.schema.SpartansValue other) {
    if (other == null) {
      return new com.spartans.schema.SpartansValue.Builder();
    } else {
      return new com.spartans.schema.SpartansValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for SpartansValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SpartansValue>
    implements org.apache.avro.data.RecordBuilder<SpartansValue> {

    /** This field indicates the payload in its byte form */
    private java.nio.ByteBuffer medData;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.spartans.schema.SpartansValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.medData)) {
        this.medData = data().deepCopy(fields()[0].schema(), other.medData);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing SpartansValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.spartans.schema.SpartansValue other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.medData)) {
        this.medData = data().deepCopy(fields()[0].schema(), other.medData);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'medData' field.
      * This field indicates the payload in its byte form
      * @return The value.
      */
    public java.nio.ByteBuffer getMedData() {
      return medData;
    }


    /**
      * Sets the value of the 'medData' field.
      * This field indicates the payload in its byte form
      * @param value The value of 'medData'.
      * @return This builder.
      */
    public com.spartans.schema.SpartansValue.Builder setMedData(java.nio.ByteBuffer value) {
      validate(fields()[0], value);
      this.medData = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'medData' field has been set.
      * This field indicates the payload in its byte form
      * @return True if the 'medData' field has been set, false otherwise.
      */
    public boolean hasMedData() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'medData' field.
      * This field indicates the payload in its byte form
      * @return This builder.
      */
    public com.spartans.schema.SpartansValue.Builder clearMedData() {
      medData = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SpartansValue build() {
      try {
        SpartansValue record = new SpartansValue();
        record.medData = fieldSetFlags()[0] ? this.medData : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SpartansValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<SpartansValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SpartansValue>
    READER$ = (org.apache.avro.io.DatumReader<SpartansValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.medData == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeBytes(this.medData);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.medData = null;
      } else {
        this.medData = in.readBytes(this.medData);
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.medData = null;
          } else {
            this.medData = in.readBytes(this.medData);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










