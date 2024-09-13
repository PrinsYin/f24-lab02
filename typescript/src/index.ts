import { newRenderer } from "./renderer.js"
import { Square } from "./shapes/square.js";
import { Rectangle} from "./shapes/rectangle.js";
import { Circle} from "./shapes/circle.js";
import { Shape} from "./shapes/shape.js";
const rectangle: Shape = Rectangle(2, 3)
const circle: Shape = Circle(2)
const square: Shape = Square(3)

const renderer = newRenderer(rectangle)
renderer.draw();

const renderer2 = newRenderer(circle)
renderer2.draw();

const renderer3 = newRenderer(square)
renderer3.draw();