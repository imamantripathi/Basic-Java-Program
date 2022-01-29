// package com.company;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.File;
public class FSTreeDemo {
 public static void main(String[] args) {
 JFrame f = new JFrame("FSTreeDemo");
 f.setSize(300,300);
 FSTreeModel model = new FSTreeModel(args[0]);
 JTree tree = new JTree();
 tree.setModel(model);
 JScrollPane jsp = new JScrollPane(tree);
 f.getContentPane().add(jsp);
 f.setVisible(true);
 }
}
class FSTreeModel implements TreeModel {
 File root;

 public FSTreeModel(String path) {
  this.root = new File(path);
 }

 public Object getRoot() {
  return root;
 }

 public Object getChild(Object p, int in) {
  String[] c = ((File) p).list();
  return (c == null) || (in >= c.length) ? null : new File((File) p, c[in]);
 }

 public int getIndexOfChild(Object p, Object c) {
  String[] l = ((File) p).list();
  if (l == null) return -1;
  String name = ((File) c).getName();
  for (int i = 0; i < l.length; i++)
   if (name.equals(l[i])) return i;
  return -1;
 }

 public int getChildCount(Object p) {
  String[] c = ((File) p).list();
  return c != null ? c.length : 0;
 }

 public boolean isLeaf(Object node) {
  return ((File) node).isFile();
 }

 public void addTreeModelListener(TreeModelListener l) {
 }

 public void removeTreeModelListener(TreeModelListener l) {
 }

 public void valueForPathChanged(TreePath path, Object newvalue) {
 }
}