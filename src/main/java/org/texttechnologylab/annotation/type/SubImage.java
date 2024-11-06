

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SubImage extends Annotation {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.type.SubImage";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(SubImage.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }


    /* *******************
     *   Feature Offsets *
     * *******************/

    public final static String _FeatName_coordinates = "coordinates";
    public final static String _FeatName_parent = "parent";


    /* Feature Adjusted Offsets */
    private final static CallSite _FC_coordinates = TypeSystemImpl.createCallSite(SubImage.class, "coordinates");
    private final static MethodHandle _FH_coordinates = _FC_coordinates.dynamicInvoker();
    private final static CallSite _FC_parent = TypeSystemImpl.createCallSite(SubImage.class, "parent");
    private final static MethodHandle _FH_parent = _FC_parent.dynamicInvoker();


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected SubImage() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public SubImage(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public SubImage(JCas jcas) {
        super(jcas);
        readObject();
    }


    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public SubImage(JCas jcas, int begin, int end) {
        super(jcas);
        setBegin(begin);
        setEnd(end);
        readObject();
    }

    /**
     * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: coordinates

    /**
     * getter for coordinates - gets
     *
     * @return value of the feature
     * @generated
     */
    @SuppressWarnings("unchecked")
    public FSArray<Coordinate> getCoordinates() {
        return (FSArray<Coordinate>) (_getFeatureValueNc(wrapGetIntCatchException(_FH_coordinates)));
    }

    /**
     * setter for coordinates - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setCoordinates(FSArray<Coordinate> v) {
        _setFeatureValueNcWj(wrapGetIntCatchException(_FH_coordinates), v);
    }


    /**
     * indexed getter for coordinates - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Coordinate getCoordinates(int i) {
        return (Coordinate) (((FSArray<Coordinate>) (_getFeatureValueNc(wrapGetIntCatchException(_FH_coordinates)))).get(i));
    }

    /** indexed setter for coordinates - sets an indexed value -
   * @generated
     * @param i index in the array to set
     * @param v value to set into the array
     */
    @SuppressWarnings("unchecked")
    public void setCoordinates(int i, Coordinate v) {
        ((FSArray<Coordinate>) (_getFeatureValueNc(wrapGetIntCatchException(_FH_coordinates)))).set(i, v);
    }


    //*--------------*
    //* Feature: parent

    /**
     * getter for parent - gets
     *
     * @return value of the feature
     * @generated
     */
    public Image getParent() {
        return (Image) (_getFeatureValueNc(wrapGetIntCatchException(_FH_parent)));
    }

    /** setter for parent - sets
     * @generated
   * @param v value to set into the feature 
   */
  public void setParent(Image v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_parent), v);
  }    
    
  }

    