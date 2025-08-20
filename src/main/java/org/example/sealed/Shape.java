package org.example.sealed;

public sealed class Shape permits Circle, Square {}

non-sealed class Circle extends Shape{}
final class Square extends Shape {}

class SemiCircle extends Circle {}

