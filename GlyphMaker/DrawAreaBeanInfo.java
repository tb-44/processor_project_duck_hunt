/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlyphMaker;

import java.beans.*;

public class DrawAreaBeanInfo extends SimpleBeanInfo {
    private static BeanDescriptor getBdescriptor() {
        BeanDescriptor beanDescriptor = new BeanDescriptor(GlyphMaker.DrawArea.class, null);
        return beanDescriptor;
    }

    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autoscrolls = 5;
    private static final int PROPERTY_background = 6;
    private static final int PROPERTY_backgroundSet = 7;
    private static final int PROPERTY_baselineResizeBehavior = 8;
    private static final int PROPERTY_border = 9;
    private static final int PROPERTY_bounds = 10;
    private static final int PROPERTY_color = 11;
    private static final int PROPERTY_colorModel = 12;
    private static final int PROPERTY_component = 13;
    private static final int PROPERTY_componentCount = 14;
    private static final int PROPERTY_componentListeners = 15;
    private static final int PROPERTY_componentOrientation = 16;
    private static final int PROPERTY_componentPopupMenu = 17;
    private static final int PROPERTY_components = 18;
    private static final int PROPERTY_containerListeners = 19;
    private static final int PROPERTY_cursor = 20;
    private static final int PROPERTY_cursorSet = 21;
    private static final int PROPERTY_debugGraphicsOptions = 22;
    private static final int PROPERTY_displayable = 23;
    private static final int PROPERTY_doubleBuffered = 24;
    private static final int PROPERTY_dropTarget = 25;
    private static final int PROPERTY_enabled = 26;
    private static final int PROPERTY_focusable = 27;
    private static final int PROPERTY_focusCycleRoot = 28;
    private static final int PROPERTY_focusCycleRootAncestor = 29;
    private static final int PROPERTY_focusListeners = 30;
    private static final int PROPERTY_focusOwner = 31;
    private static final int PROPERTY_focusTraversable = 32;
    private static final int PROPERTY_focusTraversalKeys = 33;
    private static final int PROPERTY_focusTraversalKeysEnabled = 34;
    private static final int PROPERTY_focusTraversalPolicy = 35;
    private static final int PROPERTY_focusTraversalPolicyProvider = 36;
    private static final int PROPERTY_focusTraversalPolicySet = 37;
    private static final int PROPERTY_font = 38;
    private static final int PROPERTY_fontSet = 39;
    private static final int PROPERTY_foreground = 40;
    private static final int PROPERTY_foregroundSet = 41;
    private static final int PROPERTY_graphics = 42;
    private static final int PROPERTY_graphicsConfiguration = 43;
    private static final int PROPERTY_height = 44;
    private static final int PROPERTY_hierarchyBoundsListeners = 45;
    private static final int PROPERTY_hierarchyListeners = 46;
    private static final int PROPERTY_ignoreRepaint = 47;
    private static final int PROPERTY_inheritsPopupMenu = 48;
    private static final int PROPERTY_inputContext = 49;
    private static final int PROPERTY_inputMap = 50;
    private static final int PROPERTY_inputMethodListeners = 51;
    private static final int PROPERTY_inputMethodRequests = 52;
    private static final int PROPERTY_inputVerifier = 53;
    private static final int PROPERTY_insets = 54;
    private static final int PROPERTY_keyListeners = 55;
    private static final int PROPERTY_layout = 56;
    private static final int PROPERTY_lightweight = 57;
    private static final int PROPERTY_locale = 58;
    private static final int PROPERTY_location = 59;
    private static final int PROPERTY_locationOnScreen = 60;
    private static final int PROPERTY_managingFocus = 61;
    private static final int PROPERTY_maximumSize = 62;
    private static final int PROPERTY_maximumSizeSet = 63;
    private static final int PROPERTY_minimumSize = 64;
    private static final int PROPERTY_minimumSizeSet = 65;
    private static final int PROPERTY_mouseListeners = 66;
    private static final int PROPERTY_mouseMotionListeners = 67;
    private static final int PROPERTY_mousePosition = 68;
    private static final int PROPERTY_mouseWheelListeners = 69;
    private static final int PROPERTY_name = 70;
    private static final int PROPERTY_nextFocusableComponent = 71;
    private static final int PROPERTY_opaque = 72;
    private static final int PROPERTY_optimizedDrawingEnabled = 73;
    private static final int PROPERTY_paintingForPrint = 74;
    private static final int PROPERTY_paintingTile = 75;
    private static final int PROPERTY_parent = 76;
    private static final int PROPERTY_peer = 77;
    private static final int PROPERTY_preferredSize = 78;
    private static final int PROPERTY_preferredSizeSet = 79;
    private static final int PROPERTY_propertyChangeListeners = 80;
    private static final int PROPERTY_registeredKeyStrokes = 81;
    private static final int PROPERTY_requestFocusEnabled = 82;
    private static final int PROPERTY_rootPane = 83;
    private static final int PROPERTY_showing = 84;
    private static final int PROPERTY_size = 85;
    private static final int PROPERTY_toolkit = 86;
    private static final int PROPERTY_toolTipText = 87;
    private static final int PROPERTY_topLevelAncestor = 88;
    private static final int PROPERTY_transferHandler = 89;
    private static final int PROPERTY_treeLock = 90;
    private static final int PROPERTY_UIClassID = 91;
    private static final int PROPERTY_valid = 92;
    private static final int PROPERTY_validateRoot = 93;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 94;
    private static final int PROPERTY_vetoableChangeListeners = 95;
    private static final int PROPERTY_visible = 96;
    private static final int PROPERTY_visibleRect = 97;
    private static final int PROPERTY_width = 98;
    private static final int PROPERTY_x = 99;
    private static final int PROPERTY_y = 100;

    // Property array
    /* lazy PropertyDescriptor */
    private static PropertyDescriptor[] getPdescriptor() {
        PropertyDescriptor[] properties = new PropertyDescriptor[101];

        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor("accessibleContext",
                    GlyphMaker.DrawArea.class, "getAccessibleContext", null);
            properties[PROPERTY_actionMap] = new PropertyDescriptor("actionMap", GlyphMaker.DrawArea.class,
                    "getActionMap", "setActionMap");
            properties[PROPERTY_alignmentX] = new PropertyDescriptor("alignmentX", GlyphMaker.DrawArea.class,
                    "getAlignmentX", "setAlignmentX");
            properties[PROPERTY_alignmentY] = new PropertyDescriptor("alignmentY", GlyphMaker.DrawArea.class,
                    "getAlignmentY", "setAlignmentY");
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor("ancestorListeners",
                    GlyphMaker.DrawArea.class, "getAncestorListeners", null);
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor("autoscrolls", GlyphMaker.DrawArea.class,
                    "getAutoscrolls", "setAutoscrolls");
            properties[PROPERTY_background] = new PropertyDescriptor("background", GlyphMaker.DrawArea.class,
                    "getBackground", "setBackground");
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor("backgroundSet", GlyphMaker.DrawArea.class,
                    "isBackgroundSet", null);
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor("baselineResizeBehavior",
                    GlyphMaker.DrawArea.class, "getBaselineResizeBehavior", null);
            properties[PROPERTY_border] = new PropertyDescriptor("border", GlyphMaker.DrawArea.class, "getBorder",
                    "setBorder");
            properties[PROPERTY_bounds] = new PropertyDescriptor("bounds", GlyphMaker.DrawArea.class, "getBounds",
                    "setBounds");
            properties[PROPERTY_color] = new PropertyDescriptor("color", GlyphMaker.DrawArea.class, null, "setColor");
            properties[PROPERTY_colorModel] = new PropertyDescriptor("colorModel", GlyphMaker.DrawArea.class,
                    "getColorModel", null);
            properties[PROPERTY_component] = new IndexedPropertyDescriptor("component", GlyphMaker.DrawArea.class, null,
                    null, "getComponent", null);
            properties[PROPERTY_componentCount] = new PropertyDescriptor("componentCount", GlyphMaker.DrawArea.class,
                    "getComponentCount", null);
            properties[PROPERTY_componentListeners] = new PropertyDescriptor("componentListeners",
                    GlyphMaker.DrawArea.class, "getComponentListeners", null);
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor("componentOrientation",
                    GlyphMaker.DrawArea.class, "getComponentOrientation", "setComponentOrientation");
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor("componentPopupMenu",
                    GlyphMaker.DrawArea.class, "getComponentPopupMenu", "setComponentPopupMenu");
            properties[PROPERTY_components] = new PropertyDescriptor("components", GlyphMaker.DrawArea.class,
                    "getComponents", null);
            properties[PROPERTY_containerListeners] = new PropertyDescriptor("containerListeners",
                    GlyphMaker.DrawArea.class, "getContainerListeners", null);
            properties[PROPERTY_cursor] = new PropertyDescriptor("cursor", GlyphMaker.DrawArea.class, "getCursor",
                    "setCursor");
            properties[PROPERTY_cursorSet] = new PropertyDescriptor("cursorSet", GlyphMaker.DrawArea.class,
                    "isCursorSet", null);
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor("debugGraphicsOptions",
                    GlyphMaker.DrawArea.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions");
            properties[PROPERTY_displayable] = new PropertyDescriptor("displayable", GlyphMaker.DrawArea.class,
                    "isDisplayable", null);
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor("doubleBuffered", GlyphMaker.DrawArea.class,
                    "isDoubleBuffered", "setDoubleBuffered");
            properties[PROPERTY_dropTarget] = new PropertyDescriptor("dropTarget", GlyphMaker.DrawArea.class,
                    "getDropTarget", "setDropTarget");
            properties[PROPERTY_enabled] = new PropertyDescriptor("enabled", GlyphMaker.DrawArea.class, "isEnabled",
                    "setEnabled");
            properties[PROPERTY_focusable] = new PropertyDescriptor("focusable", GlyphMaker.DrawArea.class,
                    "isFocusable", "setFocusable");
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor("focusCycleRoot", GlyphMaker.DrawArea.class,
                    "isFocusCycleRoot", "setFocusCycleRoot");
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor("focusCycleRootAncestor",
                    GlyphMaker.DrawArea.class, "getFocusCycleRootAncestor", null);
            properties[PROPERTY_focusListeners] = new PropertyDescriptor("focusListeners", GlyphMaker.DrawArea.class,
                    "getFocusListeners", null);
            properties[PROPERTY_focusOwner] = new PropertyDescriptor("focusOwner", GlyphMaker.DrawArea.class,
                    "isFocusOwner", null);
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor("focusTraversable",
                    GlyphMaker.DrawArea.class, "isFocusTraversable", null);
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor("focusTraversalKeys",
                    GlyphMaker.DrawArea.class, null, null, null, "setFocusTraversalKeys");
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor("focusTraversalKeysEnabled",
                    GlyphMaker.DrawArea.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled");
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor("focusTraversalPolicy",
                    GlyphMaker.DrawArea.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy");
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor("focusTraversalPolicyProvider",
                    GlyphMaker.DrawArea.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider");
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor("focusTraversalPolicySet",
                    GlyphMaker.DrawArea.class, "isFocusTraversalPolicySet", null);
            properties[PROPERTY_font] = new PropertyDescriptor("font", GlyphMaker.DrawArea.class, "getFont", "setFont");
            properties[PROPERTY_fontSet] = new PropertyDescriptor("fontSet", GlyphMaker.DrawArea.class, "isFontSet",
                    null);
            properties[PROPERTY_foreground] = new PropertyDescriptor("foreground", GlyphMaker.DrawArea.class,
                    "getForeground", "setForeground");
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor("foregroundSet", GlyphMaker.DrawArea.class,
                    "isForegroundSet", null);
            properties[PROPERTY_graphics] = new PropertyDescriptor("graphics", GlyphMaker.DrawArea.class, "getGraphics",
                    null);
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor("graphicsConfiguration",
                    GlyphMaker.DrawArea.class, "getGraphicsConfiguration", null);
            properties[PROPERTY_height] = new PropertyDescriptor("height", GlyphMaker.DrawArea.class, "getHeight",
                    null);
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor("hierarchyBoundsListeners",
                    GlyphMaker.DrawArea.class, "getHierarchyBoundsListeners", null);
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor("hierarchyListeners",
                    GlyphMaker.DrawArea.class, "getHierarchyListeners", null);
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor("ignoreRepaint", GlyphMaker.DrawArea.class,
                    "getIgnoreRepaint", "setIgnoreRepaint");
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor("inheritsPopupMenu",
                    GlyphMaker.DrawArea.class, "getInheritsPopupMenu", "setInheritsPopupMenu");
            properties[PROPERTY_inputContext] = new PropertyDescriptor("inputContext", GlyphMaker.DrawArea.class,
                    "getInputContext", null);
            properties[PROPERTY_inputMap] = new PropertyDescriptor("inputMap", GlyphMaker.DrawArea.class, "getInputMap",
                    null);
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor("inputMethodListeners",
                    GlyphMaker.DrawArea.class, "getInputMethodListeners", null);
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor("inputMethodRequests",
                    GlyphMaker.DrawArea.class, "getInputMethodRequests", null);
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor("inputVerifier", GlyphMaker.DrawArea.class,
                    "getInputVerifier", "setInputVerifier");
            properties[PROPERTY_insets] = new PropertyDescriptor("insets", GlyphMaker.DrawArea.class, "getInsets",
                    null);
            properties[PROPERTY_keyListeners] = new PropertyDescriptor("keyListeners", GlyphMaker.DrawArea.class,
                    "getKeyListeners", null);
            properties[PROPERTY_layout] = new PropertyDescriptor("layout", GlyphMaker.DrawArea.class, "getLayout",
                    "setLayout");
            properties[PROPERTY_lightweight] = new PropertyDescriptor("lightweight", GlyphMaker.DrawArea.class,
                    "isLightweight", null);
            properties[PROPERTY_locale] = new PropertyDescriptor("locale", GlyphMaker.DrawArea.class, "getLocale",
                    "setLocale");
            properties[PROPERTY_location] = new PropertyDescriptor("location", GlyphMaker.DrawArea.class, "getLocation",
                    "setLocation");
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor("locationOnScreen",
                    GlyphMaker.DrawArea.class, "getLocationOnScreen", null);
            properties[PROPERTY_managingFocus] = new PropertyDescriptor("managingFocus", GlyphMaker.DrawArea.class,
                    "isManagingFocus", null);
            properties[PROPERTY_maximumSize] = new PropertyDescriptor("maximumSize", GlyphMaker.DrawArea.class,
                    "getMaximumSize", "setMaximumSize");
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor("maximumSizeSet", GlyphMaker.DrawArea.class,
                    "isMaximumSizeSet", null);
            properties[PROPERTY_minimumSize] = new PropertyDescriptor("minimumSize", GlyphMaker.DrawArea.class,
                    "getMinimumSize", "setMinimumSize");
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor("minimumSizeSet", GlyphMaker.DrawArea.class,
                    "isMinimumSizeSet", null);
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor("mouseListeners", GlyphMaker.DrawArea.class,
                    "getMouseListeners", null);
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor("mouseMotionListeners",
                    GlyphMaker.DrawArea.class, "getMouseMotionListeners", null);
            properties[PROPERTY_mousePosition] = new PropertyDescriptor("mousePosition", GlyphMaker.DrawArea.class,
                    "getMousePosition", null);
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor("mouseWheelListeners",
                    GlyphMaker.DrawArea.class, "getMouseWheelListeners", null);
            properties[PROPERTY_name] = new PropertyDescriptor("name", GlyphMaker.DrawArea.class, "getName", "setName");
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor("nextFocusableComponent",
                    GlyphMaker.DrawArea.class, "getNextFocusableComponent", "setNextFocusableComponent");
            properties[PROPERTY_opaque] = new PropertyDescriptor("opaque", GlyphMaker.DrawArea.class, "isOpaque",
                    "setOpaque");
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor("optimizedDrawingEnabled",
                    GlyphMaker.DrawArea.class, "isOptimizedDrawingEnabled", null);
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor("paintingForPrint",
                    GlyphMaker.DrawArea.class, "isPaintingForPrint", null);
            properties[PROPERTY_paintingTile] = new PropertyDescriptor("paintingTile", GlyphMaker.DrawArea.class,
                    "isPaintingTile", null);
            properties[PROPERTY_parent] = new PropertyDescriptor("parent", GlyphMaker.DrawArea.class, "getParent",
                    null);
            properties[PROPERTY_peer] = new PropertyDescriptor("peer", GlyphMaker.DrawArea.class, "getPeer", null);
            properties[PROPERTY_preferredSize] = new PropertyDescriptor("preferredSize", GlyphMaker.DrawArea.class,
                    "getPreferredSize", "setPreferredSize");
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor("preferredSizeSet",
                    GlyphMaker.DrawArea.class, "isPreferredSizeSet", null);
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor("propertyChangeListeners",
                    GlyphMaker.DrawArea.class, "getPropertyChangeListeners", null);
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor("registeredKeyStrokes",
                    GlyphMaker.DrawArea.class, "getRegisteredKeyStrokes", null);
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor("requestFocusEnabled",
                    GlyphMaker.DrawArea.class, "isRequestFocusEnabled", "setRequestFocusEnabled");
            properties[PROPERTY_rootPane] = new PropertyDescriptor("rootPane", GlyphMaker.DrawArea.class, "getRootPane",
                    null);
            properties[PROPERTY_showing] = new PropertyDescriptor("showing", GlyphMaker.DrawArea.class, "isShowing",
                    null);
            properties[PROPERTY_size] = new PropertyDescriptor("size", GlyphMaker.DrawArea.class, "getSize", "setSize");
            properties[PROPERTY_toolkit] = new PropertyDescriptor("toolkit", GlyphMaker.DrawArea.class, "getToolkit",
                    null);
            properties[PROPERTY_toolTipText] = new PropertyDescriptor("toolTipText", GlyphMaker.DrawArea.class,
                    "getToolTipText", "setToolTipText");
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor("topLevelAncestor",
                    GlyphMaker.DrawArea.class, "getTopLevelAncestor", null);
            properties[PROPERTY_transferHandler] = new PropertyDescriptor("transferHandler", GlyphMaker.DrawArea.class,
                    "getTransferHandler", "setTransferHandler");
            properties[PROPERTY_treeLock] = new PropertyDescriptor("treeLock", GlyphMaker.DrawArea.class, "getTreeLock",
                    null);
            properties[PROPERTY_UIClassID] = new PropertyDescriptor("UIClassID", GlyphMaker.DrawArea.class,
                    "getUIClassID", null);
            properties[PROPERTY_valid] = new PropertyDescriptor("valid", GlyphMaker.DrawArea.class, "isValid", null);
            properties[PROPERTY_validateRoot] = new PropertyDescriptor("validateRoot", GlyphMaker.DrawArea.class,
                    "isValidateRoot", null);
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor("verifyInputWhenFocusTarget",
                    GlyphMaker.DrawArea.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget");
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor("vetoableChangeListeners",
                    GlyphMaker.DrawArea.class, "getVetoableChangeListeners", null);
            properties[PROPERTY_visible] = new PropertyDescriptor("visible", GlyphMaker.DrawArea.class, "isVisible",
                    "setVisible");
            properties[PROPERTY_visibleRect] = new PropertyDescriptor("visibleRect", GlyphMaker.DrawArea.class,
                    "getVisibleRect", null);
            properties[PROPERTY_width] = new PropertyDescriptor("width", GlyphMaker.DrawArea.class, "getWidth", null);
            properties[PROPERTY_x] = new PropertyDescriptor("x", GlyphMaker.DrawArea.class, "getX", null);
            properties[PROPERTY_y] = new PropertyDescriptor("y", GlyphMaker.DrawArea.class, "getY", null);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return properties;
    }

    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /* lazy EventSetDescriptor */
    private static EventSetDescriptor[] getEdescriptor() {
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];

        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class, "ancestorListener",
                    javax.swing.event.AncestorListener.class,
                    new String[] { "ancestorAdded", "ancestorRemoved", "ancestorMoved" }, "addAncestorListener",
                    "removeAncestorListener");
            eventSets[EVENT_componentListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class, "componentListener",
                    java.awt.event.ComponentListener.class,
                    new String[] { "componentResized", "componentMoved", "componentShown", "componentHidden" },
                    "addComponentListener", "removeComponentListener");
            eventSets[EVENT_containerListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class, "containerListener",
                    java.awt.event.ContainerListener.class, new String[] { "componentAdded", "componentRemoved" },
                    "addContainerListener", "removeContainerListener");
            eventSets[EVENT_focusListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class, "focusListener",
                    java.awt.event.FocusListener.class, new String[] { "focusGained", "focusLost" }, "addFocusListener",
                    "removeFocusListener");
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class,
                    "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class,
                    new String[] { "ancestorMoved", "ancestorResized" }, "addHierarchyBoundsListener",
                    "removeHierarchyBoundsListener");
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class, "hierarchyListener",
                    java.awt.event.HierarchyListener.class, new String[] { "hierarchyChanged" }, "addHierarchyListener",
                    "removeHierarchyListener");
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class,
                    "inputMethodListener", java.awt.event.InputMethodListener.class,
                    new String[] { "inputMethodTextChanged", "caretPositionChanged" }, "addInputMethodListener",
                    "removeInputMethodListener");
            eventSets[EVENT_keyListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class, "keyListener",
                    java.awt.event.KeyListener.class, new String[] { "keyTyped", "keyPressed", "keyReleased" },
                    "addKeyListener", "removeKeyListener");
            eventSets[EVENT_mouseListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class, "mouseListener",
                    java.awt.event.MouseListener.class,
                    new String[] { "mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited" },
                    "addMouseListener", "removeMouseListener");
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class,
                    "mouseMotionListener", java.awt.event.MouseMotionListener.class,
                    new String[] { "mouseDragged", "mouseMoved" }, "addMouseMotionListener",
                    "removeMouseMotionListener");
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class,
                    "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] { "mouseWheelMoved" },
                    "addMouseWheelListener", "removeMouseWheelListener");
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class,
                    "propertyChangeListener", java.beans.PropertyChangeListener.class,
                    new String[] { "propertyChange" }, "addPropertyChangeListener", "removePropertyChangeListener");
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor(GlyphMaker.DrawArea.class,
                    "vetoableChangeListener", java.beans.VetoableChangeListener.class,
                    new String[] { "vetoableChange" }, "addVetoableChangeListener", "removeVetoableChangeListener");
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return eventSets;
    }

    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_areFocusTraversalKeysSet10 = 10;
    private static final int METHOD_bounds11 = 11;
    private static final int METHOD_checkImage12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_computeVisibleRect14 = 14;
    private static final int METHOD_contains15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_countComponents17 = 17;
    private static final int METHOD_createImage18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createToolTip20 = 20;
    private static final int METHOD_createVolatileImage21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_deliverEvent23 = 23;
    private static final int METHOD_disable24 = 24;
    private static final int METHOD_dispatchEvent25 = 25;
    private static final int METHOD_doLayout26 = 26;
    private static final int METHOD_enable27 = 27;
    private static final int METHOD_enable28 = 28;
    private static final int METHOD_enableInputMethods29 = 29;
    private static final int METHOD_findComponentAt30 = 30;
    private static final int METHOD_findComponentAt31 = 31;
    private static final int METHOD_firePropertyChange32 = 32;
    private static final int METHOD_firePropertyChange33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_getActionForKeyStroke40 = 40;
    private static final int METHOD_getBaseline41 = 41;
    private static final int METHOD_getBounds42 = 42;
    private static final int METHOD_getClientProperty43 = 43;
    private static final int METHOD_getComponentAt44 = 44;
    private static final int METHOD_getComponentAt45 = 45;
    private static final int METHOD_getComponentZOrder46 = 46;
    private static final int METHOD_getConditionForKeyStroke47 = 47;
    private static final int METHOD_getDefaultLocale48 = 48;
    private static final int METHOD_getFocusTraversalKeys49 = 49;
    private static final int METHOD_getFontMetrics50 = 50;
    private static final int METHOD_getInsets51 = 51;
    private static final int METHOD_getListeners52 = 52;
    private static final int METHOD_getLocation53 = 53;
    private static final int METHOD_getMousePosition54 = 54;
    private static final int METHOD_getPopupLocation55 = 55;
    private static final int METHOD_getPropertyChangeListeners56 = 56;
    private static final int METHOD_getSize57 = 57;
    private static final int METHOD_getToolTipLocation58 = 58;
    private static final int METHOD_getToolTipText59 = 59;
    private static final int METHOD_gotFocus60 = 60;
    private static final int METHOD_grabFocus61 = 61;
    private static final int METHOD_handleEvent62 = 62;
    private static final int METHOD_hasFocus63 = 63;
    private static final int METHOD_hide64 = 64;
    private static final int METHOD_imageUpdate65 = 65;
    private static final int METHOD_insets66 = 66;
    private static final int METHOD_inside67 = 67;
    private static final int METHOD_invalidate68 = 68;
    private static final int METHOD_isAncestorOf69 = 69;
    private static final int METHOD_isFocusCycleRoot70 = 70;
    private static final int METHOD_isLightweightComponent71 = 71;
    private static final int METHOD_keyDown72 = 72;
    private static final int METHOD_keyUp73 = 73;
    private static final int METHOD_layout74 = 74;
    private static final int METHOD_list75 = 75;
    private static final int METHOD_list76 = 76;
    private static final int METHOD_list77 = 77;
    private static final int METHOD_list78 = 78;
    private static final int METHOD_list79 = 79;
    private static final int METHOD_locate80 = 80;
    private static final int METHOD_location81 = 81;
    private static final int METHOD_lostFocus82 = 82;
    private static final int METHOD_minimumSize83 = 83;
    private static final int METHOD_mouseDown84 = 84;
    private static final int METHOD_mouseDrag85 = 85;
    private static final int METHOD_mouseEnter86 = 86;
    private static final int METHOD_mouseExit87 = 87;
    private static final int METHOD_mouseMove88 = 88;
    private static final int METHOD_mouseUp89 = 89;
    private static final int METHOD_move90 = 90;
    private static final int METHOD_nextFocus91 = 91;
    private static final int METHOD_paint92 = 92;
    private static final int METHOD_paintAll93 = 93;
    private static final int METHOD_paintComponents94 = 94;
    private static final int METHOD_paintImmediately95 = 95;
    private static final int METHOD_paintImmediately96 = 96;
    private static final int METHOD_postEvent97 = 97;
    private static final int METHOD_preferredSize98 = 98;
    private static final int METHOD_prepareImage99 = 99;
    private static final int METHOD_prepareImage100 = 100;
    private static final int METHOD_print101 = 101;
    private static final int METHOD_printAll102 = 102;
    private static final int METHOD_printComponents103 = 103;
    private static final int METHOD_putClientProperty104 = 104;
    private static final int METHOD_registerKeyboardAction105 = 105;
    private static final int METHOD_registerKeyboardAction106 = 106;
    private static final int METHOD_remove107 = 107;
    private static final int METHOD_remove108 = 108;
    private static final int METHOD_remove109 = 109;
    private static final int METHOD_removeAll110 = 110;
    private static final int METHOD_removeNotify111 = 111;
    private static final int METHOD_removePropertyChangeListener112 = 112;
    private static final int METHOD_repaint113 = 113;
    private static final int METHOD_repaint114 = 114;
    private static final int METHOD_repaint115 = 115;
    private static final int METHOD_repaint116 = 116;
    private static final int METHOD_repaint117 = 117;
    private static final int METHOD_requestDefaultFocus118 = 118;
    private static final int METHOD_requestFocus119 = 119;
    private static final int METHOD_requestFocus120 = 120;
    private static final int METHOD_requestFocusInWindow121 = 121;
    private static final int METHOD_resetKeyboardActions122 = 122;
    private static final int METHOD_reshape123 = 123;
    private static final int METHOD_resize124 = 124;
    private static final int METHOD_resize125 = 125;
    private static final int METHOD_revalidate126 = 126;
    private static final int METHOD_scrollRectToVisible127 = 127;
    private static final int METHOD_setBounds128 = 128;
    private static final int METHOD_setComponentZOrder129 = 129;
    private static final int METHOD_setDefaultLocale130 = 130;
    private static final int METHOD_show131 = 131;
    private static final int METHOD_show132 = 132;
    private static final int METHOD_size133 = 133;
    private static final int METHOD_toString134 = 134;
    private static final int METHOD_transferFocus135 = 135;
    private static final int METHOD_transferFocusBackward136 = 136;
    private static final int METHOD_transferFocusDownCycle137 = 137;
    private static final int METHOD_transferFocusUpCycle138 = 138;
    private static final int METHOD_unregisterKeyboardAction139 = 139;
    private static final int METHOD_update140 = 140;
    private static final int METHOD_updateUI141 = 141;
    private static final int METHOD_validate142 = 142;

    // Method array
    /* lazy MethodDescriptor */
    private static MethodDescriptor[] getMdescriptor() {
        MethodDescriptor[] methods = new MethodDescriptor[143];

        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action",
                    new Class[] { java.awt.Event.class, java.lang.Object.class }));
            methods[METHOD_action0].setDisplayName("");
            methods[METHOD_add1] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("add", new Class[] { java.awt.PopupMenu.class }));
            methods[METHOD_add1].setDisplayName("");
            methods[METHOD_add2] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("add", new Class[] { java.awt.Component.class }));
            methods[METHOD_add2].setDisplayName("");
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add",
                    new Class[] { java.lang.String.class, java.awt.Component.class }));
            methods[METHOD_add3].setDisplayName("");
            methods[METHOD_add4] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("add", new Class[] { java.awt.Component.class, int.class }));
            methods[METHOD_add4].setDisplayName("");
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add",
                    new Class[] { java.awt.Component.class, java.lang.Object.class }));
            methods[METHOD_add5].setDisplayName("");
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add",
                    new Class[] { java.awt.Component.class, java.lang.Object.class, int.class }));
            methods[METHOD_add6].setDisplayName("");
            methods[METHOD_addNotify7] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("addNotify", new Class[] {}));
            methods[METHOD_addNotify7].setDisplayName("");
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("addPropertyChangeListener",
                            new Class[] { java.lang.String.class, java.beans.PropertyChangeListener.class }));
            methods[METHOD_addPropertyChangeListener8].setDisplayName("");
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class
                    .getMethod("applyComponentOrientation", new Class[] { java.awt.ComponentOrientation.class }));
            methods[METHOD_applyComponentOrientation9].setDisplayName("");
            methods[METHOD_areFocusTraversalKeysSet10] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] { int.class }));
            methods[METHOD_areFocusTraversalKeysSet10].setDisplayName("");
            methods[METHOD_bounds11] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("bounds", new Class[] {}));
            methods[METHOD_bounds11].setDisplayName("");
            methods[METHOD_checkImage12] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage",
                    new Class[] { java.awt.Image.class, java.awt.image.ImageObserver.class }));
            methods[METHOD_checkImage12].setDisplayName("");
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage",
                    new Class[] { java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class }));
            methods[METHOD_checkImage13].setDisplayName("");
            methods[METHOD_computeVisibleRect14] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("computeVisibleRect", new Class[] { java.awt.Rectangle.class }));
            methods[METHOD_computeVisibleRect14].setDisplayName("");
            methods[METHOD_contains15] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("contains", new Class[] { java.awt.Point.class }));
            methods[METHOD_contains15].setDisplayName("");
            methods[METHOD_contains16] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("contains", new Class[] { int.class, int.class }));
            methods[METHOD_contains16].setDisplayName("");
            methods[METHOD_countComponents17] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("countComponents", new Class[] {}));
            methods[METHOD_countComponents17].setDisplayName("");
            methods[METHOD_createImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage",
                    new Class[] { java.awt.image.ImageProducer.class }));
            methods[METHOD_createImage18].setDisplayName("");
            methods[METHOD_createImage19] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("createImage", new Class[] { int.class, int.class }));
            methods[METHOD_createImage19].setDisplayName("");
            methods[METHOD_createToolTip20] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {}));
            methods[METHOD_createToolTip20].setDisplayName("");
            methods[METHOD_createVolatileImage21] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("createVolatileImage", new Class[] { int.class, int.class }));
            methods[METHOD_createVolatileImage21].setDisplayName("");
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod(
                    "createVolatileImage", new Class[] { int.class, int.class, java.awt.ImageCapabilities.class }));
            methods[METHOD_createVolatileImage22].setDisplayName("");
            methods[METHOD_deliverEvent23] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("deliverEvent", new Class[] { java.awt.Event.class }));
            methods[METHOD_deliverEvent23].setDisplayName("");
            methods[METHOD_disable24] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("disable", new Class[] {}));
            methods[METHOD_disable24].setDisplayName("");
            methods[METHOD_dispatchEvent25] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("dispatchEvent", new Class[] { java.awt.AWTEvent.class }));
            methods[METHOD_dispatchEvent25].setDisplayName("");
            methods[METHOD_doLayout26] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("doLayout", new Class[] {}));
            methods[METHOD_doLayout26].setDisplayName("");
            methods[METHOD_enable27] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("enable", new Class[] { boolean.class }));
            methods[METHOD_enable27].setDisplayName("");
            methods[METHOD_enable28] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("enable", new Class[] {}));
            methods[METHOD_enable28].setDisplayName("");
            methods[METHOD_enableInputMethods29] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("enableInputMethods", new Class[] { boolean.class }));
            methods[METHOD_enableInputMethods29].setDisplayName("");
            methods[METHOD_findComponentAt30] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("findComponentAt", new Class[] { int.class, int.class }));
            methods[METHOD_findComponentAt30].setDisplayName("");
            methods[METHOD_findComponentAt31] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("findComponentAt", new Class[] { java.awt.Point.class }));
            methods[METHOD_findComponentAt31].setDisplayName("");
            methods[METHOD_firePropertyChange32] = new MethodDescriptor(java.awt.Component.class
                    .getMethod("firePropertyChange", new Class[] { java.lang.String.class, byte.class, byte.class }));
            methods[METHOD_firePropertyChange32].setDisplayName("");
            methods[METHOD_firePropertyChange33] = new MethodDescriptor(java.awt.Component.class
                    .getMethod("firePropertyChange", new Class[] { java.lang.String.class, short.class, short.class }));
            methods[METHOD_firePropertyChange33].setDisplayName("");
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class
                    .getMethod("firePropertyChange", new Class[] { java.lang.String.class, long.class, long.class }));
            methods[METHOD_firePropertyChange34].setDisplayName("");
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class
                    .getMethod("firePropertyChange", new Class[] { java.lang.String.class, float.class, float.class }));
            methods[METHOD_firePropertyChange35].setDisplayName("");
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod(
                    "firePropertyChange", new Class[] { java.lang.String.class, double.class, double.class }));
            methods[METHOD_firePropertyChange36].setDisplayName("");
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(javax.swing.JComponent.class.getMethod(
                    "firePropertyChange", new Class[] { java.lang.String.class, boolean.class, boolean.class }));
            methods[METHOD_firePropertyChange37].setDisplayName("");
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("firePropertyChange", new Class[] { java.lang.String.class, int.class, int.class }));
            methods[METHOD_firePropertyChange38].setDisplayName("");
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("firePropertyChange", new Class[] { java.lang.String.class, char.class, char.class }));
            methods[METHOD_firePropertyChange39].setDisplayName("");
            methods[METHOD_getActionForKeyStroke40] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("getActionForKeyStroke", new Class[] { javax.swing.KeyStroke.class }));
            methods[METHOD_getActionForKeyStroke40].setDisplayName("");
            methods[METHOD_getBaseline41] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getBaseline", new Class[] { int.class, int.class }));
            methods[METHOD_getBaseline41].setDisplayName("");
            methods[METHOD_getBounds42] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getBounds", new Class[] { java.awt.Rectangle.class }));
            methods[METHOD_getBounds42].setDisplayName("");
            methods[METHOD_getClientProperty43] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("getClientProperty", new Class[] { java.lang.Object.class }));
            methods[METHOD_getClientProperty43].setDisplayName("");
            methods[METHOD_getComponentAt44] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("getComponentAt", new Class[] { int.class, int.class }));
            methods[METHOD_getComponentAt44].setDisplayName("");
            methods[METHOD_getComponentAt45] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("getComponentAt", new Class[] { java.awt.Point.class }));
            methods[METHOD_getComponentAt45].setDisplayName("");
            methods[METHOD_getComponentZOrder46] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("getComponentZOrder", new Class[] { java.awt.Component.class }));
            methods[METHOD_getComponentZOrder46].setDisplayName("");
            methods[METHOD_getConditionForKeyStroke47] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("getConditionForKeyStroke", new Class[] { javax.swing.KeyStroke.class }));
            methods[METHOD_getConditionForKeyStroke47].setDisplayName("");
            methods[METHOD_getDefaultLocale48] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {}));
            methods[METHOD_getDefaultLocale48].setDisplayName("");
            methods[METHOD_getFocusTraversalKeys49] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] { int.class }));
            methods[METHOD_getFocusTraversalKeys49].setDisplayName("");
            methods[METHOD_getFontMetrics50] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] { java.awt.Font.class }));
            methods[METHOD_getFontMetrics50].setDisplayName("");
            methods[METHOD_getInsets51] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getInsets", new Class[] { java.awt.Insets.class }));
            methods[METHOD_getInsets51].setDisplayName("");
            methods[METHOD_getListeners52] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getListeners", new Class[] { java.lang.Class.class }));
            methods[METHOD_getListeners52].setDisplayName("");
            methods[METHOD_getLocation53] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getLocation", new Class[] { java.awt.Point.class }));
            methods[METHOD_getLocation53].setDisplayName("");
            methods[METHOD_getMousePosition54] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("getMousePosition", new Class[] { boolean.class }));
            methods[METHOD_getMousePosition54].setDisplayName("");
            methods[METHOD_getPopupLocation55] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("getPopupLocation", new Class[] { java.awt.event.MouseEvent.class }));
            methods[METHOD_getPopupLocation55].setDisplayName("");
            methods[METHOD_getPropertyChangeListeners56] = new MethodDescriptor(java.awt.Component.class
                    .getMethod("getPropertyChangeListeners", new Class[] { java.lang.String.class }));
            methods[METHOD_getPropertyChangeListeners56].setDisplayName("");
            methods[METHOD_getSize57] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("getSize", new Class[] { java.awt.Dimension.class }));
            methods[METHOD_getSize57].setDisplayName("");
            methods[METHOD_getToolTipLocation58] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("getToolTipLocation", new Class[] { java.awt.event.MouseEvent.class }));
            methods[METHOD_getToolTipLocation58].setDisplayName("");
            methods[METHOD_getToolTipText59] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("getToolTipText", new Class[] { java.awt.event.MouseEvent.class }));
            methods[METHOD_getToolTipText59].setDisplayName("");
            methods[METHOD_gotFocus60] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus",
                    new Class[] { java.awt.Event.class, java.lang.Object.class }));
            methods[METHOD_gotFocus60].setDisplayName("");
            methods[METHOD_grabFocus61] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {}));
            methods[METHOD_grabFocus61].setDisplayName("");
            methods[METHOD_handleEvent62] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("handleEvent", new Class[] { java.awt.Event.class }));
            methods[METHOD_handleEvent62].setDisplayName("");
            methods[METHOD_hasFocus63] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("hasFocus", new Class[] {}));
            methods[METHOD_hasFocus63].setDisplayName("");
            methods[METHOD_hide64] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("hide", new Class[] {}));
            methods[METHOD_hide64].setDisplayName("");
            methods[METHOD_imageUpdate65] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate",
                    new Class[] { java.awt.Image.class, int.class, int.class, int.class, int.class, int.class }));
            methods[METHOD_imageUpdate65].setDisplayName("");
            methods[METHOD_insets66] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("insets", new Class[] {}));
            methods[METHOD_insets66].setDisplayName("");
            methods[METHOD_inside67] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("inside", new Class[] { int.class, int.class }));
            methods[METHOD_inside67].setDisplayName("");
            methods[METHOD_invalidate68] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("invalidate", new Class[] {}));
            methods[METHOD_invalidate68].setDisplayName("");
            methods[METHOD_isAncestorOf69] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("isAncestorOf", new Class[] { java.awt.Component.class }));
            methods[METHOD_isAncestorOf69].setDisplayName("");
            methods[METHOD_isFocusCycleRoot70] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] { java.awt.Container.class }));
            methods[METHOD_isFocusCycleRoot70].setDisplayName("");
            methods[METHOD_isLightweightComponent71] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("isLightweightComponent", new Class[] { java.awt.Component.class }));
            methods[METHOD_isLightweightComponent71].setDisplayName("");
            methods[METHOD_keyDown72] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("keyDown", new Class[] { java.awt.Event.class, int.class }));
            methods[METHOD_keyDown72].setDisplayName("");
            methods[METHOD_keyUp73] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("keyUp", new Class[] { java.awt.Event.class, int.class }));
            methods[METHOD_keyUp73].setDisplayName("");
            methods[METHOD_layout74] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("layout", new Class[] {}));
            methods[METHOD_layout74].setDisplayName("");
            methods[METHOD_list75] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {}));
            methods[METHOD_list75].setDisplayName("");
            methods[METHOD_list76] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("list", new Class[] { java.io.PrintStream.class }));
            methods[METHOD_list76].setDisplayName("");
            methods[METHOD_list77] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("list", new Class[] { java.io.PrintWriter.class }));
            methods[METHOD_list77].setDisplayName("");
            methods[METHOD_list78] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("list", new Class[] { java.io.PrintStream.class, int.class }));
            methods[METHOD_list78].setDisplayName("");
            methods[METHOD_list79] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("list", new Class[] { java.io.PrintWriter.class, int.class }));
            methods[METHOD_list79].setDisplayName("");
            methods[METHOD_locate80] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("locate", new Class[] { int.class, int.class }));
            methods[METHOD_locate80].setDisplayName("");
            methods[METHOD_location81] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("location", new Class[] {}));
            methods[METHOD_location81].setDisplayName("");
            methods[METHOD_lostFocus82] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus",
                    new Class[] { java.awt.Event.class, java.lang.Object.class }));
            methods[METHOD_lostFocus82].setDisplayName("");
            methods[METHOD_minimumSize83] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("minimumSize", new Class[] {}));
            methods[METHOD_minimumSize83].setDisplayName("");
            methods[METHOD_mouseDown84] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown",
                    new Class[] { java.awt.Event.class, int.class, int.class }));
            methods[METHOD_mouseDown84].setDisplayName("");
            methods[METHOD_mouseDrag85] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag",
                    new Class[] { java.awt.Event.class, int.class, int.class }));
            methods[METHOD_mouseDrag85].setDisplayName("");
            methods[METHOD_mouseEnter86] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter",
                    new Class[] { java.awt.Event.class, int.class, int.class }));
            methods[METHOD_mouseEnter86].setDisplayName("");
            methods[METHOD_mouseExit87] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit",
                    new Class[] { java.awt.Event.class, int.class, int.class }));
            methods[METHOD_mouseExit87].setDisplayName("");
            methods[METHOD_mouseMove88] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove",
                    new Class[] { java.awt.Event.class, int.class, int.class }));
            methods[METHOD_mouseMove88].setDisplayName("");
            methods[METHOD_mouseUp89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp",
                    new Class[] { java.awt.Event.class, int.class, int.class }));
            methods[METHOD_mouseUp89].setDisplayName("");
            methods[METHOD_move90] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("move", new Class[] { int.class, int.class }));
            methods[METHOD_move90].setDisplayName("");
            methods[METHOD_nextFocus91] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("nextFocus", new Class[] {}));
            methods[METHOD_nextFocus91].setDisplayName("");
            methods[METHOD_paint92] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("paint", new Class[] { java.awt.Graphics.class }));
            methods[METHOD_paint92].setDisplayName("");
            methods[METHOD_paintAll93] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("paintAll", new Class[] { java.awt.Graphics.class }));
            methods[METHOD_paintAll93].setDisplayName("");
            methods[METHOD_paintComponents94] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("paintComponents", new Class[] { java.awt.Graphics.class }));
            methods[METHOD_paintComponents94].setDisplayName("");
            methods[METHOD_paintImmediately95] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("paintImmediately", new Class[] { int.class, int.class, int.class, int.class }));
            methods[METHOD_paintImmediately95].setDisplayName("");
            methods[METHOD_paintImmediately96] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("paintImmediately", new Class[] { java.awt.Rectangle.class }));
            methods[METHOD_paintImmediately96].setDisplayName("");
            methods[METHOD_postEvent97] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("postEvent", new Class[] { java.awt.Event.class }));
            methods[METHOD_postEvent97].setDisplayName("");
            methods[METHOD_preferredSize98] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("preferredSize", new Class[] {}));
            methods[METHOD_preferredSize98].setDisplayName("");
            methods[METHOD_prepareImage99] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage",
                    new Class[] { java.awt.Image.class, java.awt.image.ImageObserver.class }));
            methods[METHOD_prepareImage99].setDisplayName("");
            methods[METHOD_prepareImage100] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage",
                    new Class[] { java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class }));
            methods[METHOD_prepareImage100].setDisplayName("");
            methods[METHOD_print101] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("print", new Class[] { java.awt.Graphics.class }));
            methods[METHOD_print101].setDisplayName("");
            methods[METHOD_printAll102] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("printAll", new Class[] { java.awt.Graphics.class }));
            methods[METHOD_printAll102].setDisplayName("");
            methods[METHOD_printComponents103] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("printComponents", new Class[] { java.awt.Graphics.class }));
            methods[METHOD_printComponents103].setDisplayName("");
            methods[METHOD_putClientProperty104] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("putClientProperty", new Class[] { java.lang.Object.class, java.lang.Object.class }));
            methods[METHOD_putClientProperty104].setDisplayName("");
            methods[METHOD_registerKeyboardAction105] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("registerKeyboardAction", new Class[] { java.awt.event.ActionListener.class,
                            java.lang.String.class, javax.swing.KeyStroke.class, int.class }));
            methods[METHOD_registerKeyboardAction105].setDisplayName("");
            methods[METHOD_registerKeyboardAction106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod(
                    "registerKeyboardAction",
                    new Class[] { java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class }));
            methods[METHOD_registerKeyboardAction106].setDisplayName("");
            methods[METHOD_remove107] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("remove", new Class[] { java.awt.MenuComponent.class }));
            methods[METHOD_remove107].setDisplayName("");
            methods[METHOD_remove108] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("remove", new Class[] { int.class }));
            methods[METHOD_remove108].setDisplayName("");
            methods[METHOD_remove109] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("remove", new Class[] { java.awt.Component.class }));
            methods[METHOD_remove109].setDisplayName("");
            methods[METHOD_removeAll110] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("removeAll", new Class[] {}));
            methods[METHOD_removeAll110].setDisplayName("");
            methods[METHOD_removeNotify111] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {}));
            methods[METHOD_removeNotify111].setDisplayName("");
            methods[METHOD_removePropertyChangeListener112] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("removePropertyChangeListener",
                            new Class[] { java.lang.String.class, java.beans.PropertyChangeListener.class }));
            methods[METHOD_removePropertyChangeListener112].setDisplayName("");
            methods[METHOD_repaint113] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("repaint", new Class[] {}));
            methods[METHOD_repaint113].setDisplayName("");
            methods[METHOD_repaint114] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("repaint", new Class[] { long.class }));
            methods[METHOD_repaint114].setDisplayName("");
            methods[METHOD_repaint115] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint",
                    new Class[] { int.class, int.class, int.class, int.class }));
            methods[METHOD_repaint115].setDisplayName("");
            methods[METHOD_repaint116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint",
                    new Class[] { long.class, int.class, int.class, int.class, int.class }));
            methods[METHOD_repaint116].setDisplayName("");
            methods[METHOD_repaint117] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("repaint", new Class[] { java.awt.Rectangle.class }));
            methods[METHOD_repaint117].setDisplayName("");
            methods[METHOD_requestDefaultFocus118] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {}));
            methods[METHOD_requestDefaultFocus118].setDisplayName("");
            methods[METHOD_requestFocus119] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {}));
            methods[METHOD_requestFocus119].setDisplayName("");
            methods[METHOD_requestFocus120] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("requestFocus", new Class[] { boolean.class }));
            methods[METHOD_requestFocus120].setDisplayName("");
            methods[METHOD_requestFocusInWindow121] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {}));
            methods[METHOD_requestFocusInWindow121].setDisplayName("");
            methods[METHOD_resetKeyboardActions122] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {}));
            methods[METHOD_resetKeyboardActions122].setDisplayName("");
            methods[METHOD_reshape123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape",
                    new Class[] { int.class, int.class, int.class, int.class }));
            methods[METHOD_reshape123].setDisplayName("");
            methods[METHOD_resize124] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("resize", new Class[] { int.class, int.class }));
            methods[METHOD_resize124].setDisplayName("");
            methods[METHOD_resize125] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("resize", new Class[] { java.awt.Dimension.class }));
            methods[METHOD_resize125].setDisplayName("");
            methods[METHOD_revalidate126] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("revalidate", new Class[] {}));
            methods[METHOD_revalidate126].setDisplayName("");
            methods[METHOD_scrollRectToVisible127] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("scrollRectToVisible", new Class[] { java.awt.Rectangle.class }));
            methods[METHOD_scrollRectToVisible127].setDisplayName("");
            methods[METHOD_setBounds128] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds",
                    new Class[] { int.class, int.class, int.class, int.class }));
            methods[METHOD_setBounds128].setDisplayName("");
            methods[METHOD_setComponentZOrder129] = new MethodDescriptor(java.awt.Container.class
                    .getMethod("setComponentZOrder", new Class[] { java.awt.Component.class, int.class }));
            methods[METHOD_setComponentZOrder129].setDisplayName("");
            methods[METHOD_setDefaultLocale130] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] { java.util.Locale.class }));
            methods[METHOD_setDefaultLocale130].setDisplayName("");
            methods[METHOD_show131] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {}));
            methods[METHOD_show131].setDisplayName("");
            methods[METHOD_show132] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("show", new Class[] { boolean.class }));
            methods[METHOD_show132].setDisplayName("");
            methods[METHOD_size133] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {}));
            methods[METHOD_size133].setDisplayName("");
            methods[METHOD_toString134] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("toString", new Class[] {}));
            methods[METHOD_toString134].setDisplayName("");
            methods[METHOD_transferFocus135] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("transferFocus", new Class[] {}));
            methods[METHOD_transferFocus135].setDisplayName("");
            methods[METHOD_transferFocusBackward136] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {}));
            methods[METHOD_transferFocusBackward136].setDisplayName("");
            methods[METHOD_transferFocusDownCycle137] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {}));
            methods[METHOD_transferFocusDownCycle137].setDisplayName("");
            methods[METHOD_transferFocusUpCycle138] = new MethodDescriptor(
                    java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {}));
            methods[METHOD_transferFocusUpCycle138].setDisplayName("");
            methods[METHOD_unregisterKeyboardAction139] = new MethodDescriptor(javax.swing.JComponent.class
                    .getMethod("unregisterKeyboardAction", new Class[] { javax.swing.KeyStroke.class }));
            methods[METHOD_unregisterKeyboardAction139].setDisplayName("");
            methods[METHOD_update140] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("update", new Class[] { java.awt.Graphics.class }));
            methods[METHOD_update140].setDisplayName("");
            methods[METHOD_updateUI141] = new MethodDescriptor(
                    javax.swing.JComponent.class.getMethod("updateUI", new Class[] {}));
            methods[METHOD_updateUI141].setDisplayName("");
            methods[METHOD_validate142] = new MethodDescriptor(
                    java.awt.Container.class.getMethod("validate", new Class[] {}));
            methods[METHOD_validate142].setDisplayName("");
        } catch (Exception e) {
        } // GEN-HEADEREND:Methods
          // Here you can add code for customizing the methods array.

        return methods;
    }// GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;// GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;// GEN-END:IconsDef
    private static String iconNameC16 = null;// GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;// GEN-END:Icons

    private static final int defaultPropertyIndex = -1;// GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;// GEN-END:Idx

    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean. May
     *         return null if the information should be obtained by automatic
     *         analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable properties
     *         supported by this bean. May return null if the information should be
     *         obtained by automatic analysis.
     *         <p>
     *         If a property is indexed, then its entry in the result array will
     *         belong to the IndexedPropertyDescriptor subclass of
     *         PropertyDescriptor. A client of getPropertyDescriptors can use
     *         "instanceof" to check if a given PropertyDescriptor is an
     *         IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events fired
     *         by this bean. May return null if the information should be obtained
     *         by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented by
     *         this bean. May return null if the information should be obtained by
     *         automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will mostly
     * commonly be initially chosen for update by human's who are customizing the
     * bean.
     *
     * @return Index of default property in the PropertyDescriptor array returned by
     *         getPropertyDescriptors.
     *         <P>
     *         Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly commonly
     * be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned by
     *         getEventSetDescriptors.
     *         <P>
     *         Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the bean in
     * toolboxes, toolbars, etc. Icon images will typically be GIFs, but may in
     * future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     *                 constant values ICON_COLOR_16x16, ICON_COLOR_32x32,
     *                 ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null if
     *         no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
}